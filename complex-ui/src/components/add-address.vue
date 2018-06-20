/**
 * @file add-address.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
<div>
  <Form ref="addAddressForm" :model="addAddressModel" :rule="addAddressRule">
    <FormItem label="地址">
      <br>
        <al-selector data-type="name" v-model="iviewAreaData" level="2" />
    </FormItem>
  </Form>
</div>
</template>
<script>
import Util from '@/libs/util'
export default {
  name: 'add-address',
  data () {
    return {
      iviewAreaData: [],
      addAddressModel: {
        province: '',
        city: '',
        area: ''
      },
      addAddressRule: {
        
      }
    }
  },
  methods: {

  }

}
</script>
