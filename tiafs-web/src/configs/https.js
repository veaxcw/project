/**
 * @author chengw
 * ***/
import axios from 'axios'
import router from '../router/'


const env = process.env.NODE_ENV
const crossDomain = env === 'dev'

let instance = axios.create({
  baseURL: `/`,
  crossDomain: crossDomain,
  withCredentials: true
})

/**
 * 设置拦截器
 * **/
/**
 * 请求拦截器
 * ***/
axios.interceptors.request.use(config => {
  if(null != sessionStorage.getItem('token')){
      config.headers.Authorization = sessionStorage.getItem('token')
  }
  return config
  },
  error => {
  return Promise.reject(error)
  })


export default {
  /**
   * 不知道搞锤子用的
   * ***/
  get: (url, params) => {
    return new Promise((resolve, reject) => {
      instance.get(url, {params}).then(
        res => {
          resolve(res)
        }, res => {
          reject(res)
        })
    })
  },

  post: (url, params) => {
    return new Promise((resolve, reject) => {
      instance.post(url, params).then(
        res => {
          resolve(res)
        }, res => {
          reject(res)
        })
    })
  }

}
