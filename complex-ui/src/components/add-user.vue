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
        name: '',
        age: 18,
        sex: '男'
      },
      addUserRule: {
        name: [],
        age: [],
        sex: []
      }
    }
  }
}
</script>
