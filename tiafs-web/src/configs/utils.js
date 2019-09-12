// noinspection JSUnusedGlobalSymbols
/**
 * @chengw
 * **/
const utils = {// eslint-disable-line no-unused-vars
  cookie: {
    set: function (name, value, days) {
      let d = new Date()
      d.setTime(d.getTime() + days)
      window.document.cookie = name + '=' + value + ';path=/;expires=' + d.toGMTString()
    }
  }
}
