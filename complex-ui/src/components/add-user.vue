/**
 * @file add-user.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
<div>
  <Form ref="addUserForm" :model="addUserModel">
    <FormItem label="姓名" prop="name">
      <Input type="text" v-model="addUserModel.name"></Input>
    </FormItem>
    <FormItem label="年龄" prop="age">
      <Input type="text" v-model="addUserModel.age"></Input>
    </FormItem>
    <FormItem label="性别" prop="sex">
      <RadioGroup v-model="addUserModel.sex">
        <Radio label="男"></Radio>
        <Radio label="女"></Radio>
      </RadioGroup>
    </FormItem>
    <FormItem>
      <Button type="primary" @click="handleSubmit('checkMsgForm')">Submit</Button>
      <Button type="ghost" @click="handleReset('checkMsgForm')">Reset</Button>
    </FormItem>
  </Form>
</div>
</template>
<script>
import Util from '@/libs/util'
export default {
  name: 'add-user',
  data () {
    return {
      addUserModel: {
        name: '张三',
        age: 18,
        sex: '男'
      },
      addUserRule: {
        name: [],
        age: [],
        sex: []
      }
    }
  },
  methods: {
    handleSubmit (name) {
      this.$refs[name].validate((valid) => {
        if (valid) {
          util.post('/info', this.checkMsgForm).then(res => {
            this.$Message.success('Success!');
            this.$emit('setFormData', this.checkMsgForm);
            this.$emit('next');
          });
        } else {
          this.$Message.error('Fail!');
        }
      });
    },
    handleReset (name) {
      this.$refs[name].resetFields();
    }
  }
}
</script>
