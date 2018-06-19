/**
 * @file index.vue
 * @author liumapp
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/17/18
 */
<template>
  <div>
    <Row>
      <Col span="18" offset="3">
      <Card>
        <Steps :current="current">
          <Step title="提交基础信息" content="上传基础用户信息" @next="nextStep"></Step>
          <Step title="提交地址" content="用户提交收货地址" @next="nextStep" @prev="prevStep"></Step>
          <Step title="提交订单" content="用户提交订单信息" @next="nextStep" @prev="prevStep"></Step>
          <Step title="订单结果" content="展示订单结果" @prev="prevStep"></Step>
        </Steps>
        <add-user v-if="current == 0"></add-user>
        <add-address v-if="current == 1"></add-address>
        <add-order v-if="current == 2"></add-order>
        <result-list v-if="current == 3"></result-list>
      </Card>
      </Col>
    </Row>
  </div>
</template>
<script>
import AddAddress from '@/components/add-address'
import AddOrder from '@/components/add-order'
import AddUser from '@/components/add-user'
import ResultList from '@/components/result-list'
import Util from '@/libs/util'
export default {
  name: 'index',
  components: {
    AddAddress, AddOrder, AddUser, ResultList
  },
  data () {
    return {
      current: 0,
      userId: 0
    }
  },
  methods: {
    nextStep () {
      this.current++;
    },
    prevStep () {
      this.current--;
    }
  }
}
</script>
