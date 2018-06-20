/**
 * @file add-order.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
<div>
  <Form ref="addOrderForm" :model="addOrderModel" :rule="addOrderRule">
    <FormItem label="产品名称" prop="product">
      <Input type="text" v-model="addOrderModel.product"></Input>
    </FormItem>
    <FormItem label="数量" prop="number">
      <Input type="number" v-model="addOrderModel.number"></Input>
    </FormItem>
    <FormItem label="售价" prop="price">
      <Input type="number" v-model="addOrderModel.price"></Input>
    </FormItem>
    <FormItem>
      <Button type="primary" @click="handleSubmit('addOrderForm')">Submit</Button>
      <Button type="ghost" @click="handleReset('addOrderForm')">Reset</Button>
    </FormItem>
  </Form>
</div>
</template>
<script>
export default {
  name: 'add-order',
  props: {
    userId: 0,
  },
  data () {
    return {
      addOrderModel: {
        product: '苹果/个',
        number: 100,
        price: 560.05
      },
      addOrderRule: {
        product: [
          {
            type: 'string',
            trigger: 'blur',
            message: 'the product must be a string'
          }
        ],
        number: [
          {
            type: 'number',
            trigger: 'blur',
            message: 'must be a number'
          }
        ],
        price: [
          {
            type: 'number',
            trigger: 'blur',
            message: 'must be a number'
          }
        ]
      }
    };
  },
  created () {
    console.log("add-order created")
  },
  methods: {
    handleSubmit (name) {
      this.$refs[name].validate((valid) => {
        if (valid) {
          Util.post('order/add', {}.push(this.addOrderModel).push({
            userid: this.userId
          })).then(res => {
            this.$Message.success('Success!');
            this.$emit('next');
          });
        } else {
          this.$Message.error('Valid Fail!');
        }
      });
    },
    handleReset (name) {
      this.$refs[name].resetFields();
    }
  }
}
</script>
