/**
 * Created by Jimmy on 2018/1/8.
 */
const env = process.env.NODE_ENV;
// let qiniuUrl;
// if(window.location.protocol==='https:'){
//     qiniuUrl = 'https://upload.qbox.me/';
// }else{
//     qiniuUrl = 'http://upload.qiniu.com/';
// }
const urlConfigs = {
    dev:{
        CompanyName: '中设数据设计文档(dev)',
        BaseUrl:'http://test-doctool.cbim.org.cn',
        ImageUrl:'http://test-doctool.cbim.org.cn/download/',
        LoginUrl: 'http://test-doctool.cbim.org.cn/api/user/login',
        LogoutUrl: 'http://test-doctool.cbim.org.cn/api/user/applogout',
        PDFUrl:'/printApi',
        UploadUrl:'/uploadApi',
        WSUrl:'ws://test-doctool.cbim.org.cn'
    },
    test:{
        CompanyName: '中设数据设计文档(测)',
        BaseUrl:'http://test-doctool.cbim.org.cn',
        ImageUrl:'http://test-doctool.cbim.org.cn/download/',
        LoginUrl: 'http://test-doctool.cbim.org.cn/api/user/login',
        LogoutUrl: 'http://test-doctool.cbim.org.cn/api/user/applogout',
        PDFUrl:'',
        UploadUrl:'',
        WSUrl:'ws://test-doctool.cbim.org.cn'
    },
    production:{
        CompanyName: '中设数据设计文档',
        BaseUrl:'https://doctool.cbim.org.cn',
        ImageUrl:'https://doctool.cbim.org.cn/download/',
        LoginUrl: 'https://doctool.cbim.org.cn/api/user/login',
        LogoutUrl: 'https://doctool.cbim.org.cn/api/user/applogout',
        PDFUrl:'',
        UploadUrl:'',
        WSUrl:'ws://doctool.cbim.org.cn'
    }
};
export default urlConfigs[env];
