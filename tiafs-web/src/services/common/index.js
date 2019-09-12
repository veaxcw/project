/**
 * @author chengw
 * ***/

import https from '../../configs/https'

export default {
  login (params) {
    return https.post(`tiafs/v1/user`, params)
  },
  getUserInfo (params) {
    return https.get(`tiafs/v1/user`, params)
  }

}
