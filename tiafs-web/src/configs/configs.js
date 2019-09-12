/**
 * @author chengw .
 */
const env = process.env.NODE_ENV

const urlConfigs = {
  dev: {
    BaseUrl: 'http://10.81.1.31:8666',
    vCode: 'tiafs/public/v1/vCode'
  },
  test: {},
  production: {}
}
export default urlConfigs[env]
