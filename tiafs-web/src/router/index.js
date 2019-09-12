import Vue from 'vue'
import Router from 'vue-router'
import Login from '../components/login/login'
import Index from '../components/index/index'
import User from '../components/user/user'

Vue.use(Router)

export default new Router({
  // mode: 'history',
  routes: [
    {
      path: '/',
      name: 'login',
      component: Login,
      meta:{
        requireAuth: true
      }
    },
    {
      path: '/index',
      name: 'index',
      component: Index
    },
    {
      path: '/user',
      name: 'user',
      component: User,
      meta:{
        requireAuth: true
      }
    }
  ]
})
