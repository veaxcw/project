// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import ElementUI from 'element-ui'
import App from './App'
import routers from './router'
import https from './configs/https'
import services from './services/common/index.js'
import configs from './configs/configs'
import utils from './configs/utils'
import VueCookies from 'vue-cookies'

Vue.use(ElementUI)
Vue.use(VueCookies)

Vue.config.productionTip = false

// const router = new routers({
//   routes: routers
// })

Vue.prototype.$https = https
Vue.prototype.$services = services
Vue.prototype.$configs = configs
Vue.prototype.$utils = utils

new Vue({
  el: '#app',
  router: routers,
  components: {App},
  template: '<App/>'
})
