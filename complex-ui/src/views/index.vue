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
          <Step title="提交基础信息" content="上传基础用户信息"></Step>
          <Step title="初核" content="审核基础信息"></Step>
          <Step title="复审" content="复审基础信息"></Step>
          <Step title="审核结果" content="展示审核结果"></Step>
        </Steps>
        <upload-form v-if="current == 0" @setFormData="setFormData" @next="nextStep"></upload-form>
        <first-check v-if="current == 1" @next="nextStep" @prev="prevStep" :formData="formData"></first-check>
        <second-check v-if="current == 2" @next="nextStep" @prev="prevStep"></second-check>
        <result v-if="current == 3"></result>
      </Card>
      </Col>
    </Row>
  </div>
</template>
<script>
export default {
  name: 'index'
}
</script>
