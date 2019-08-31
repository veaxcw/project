/**
 * Created by Jimmy on 2018/3/7.
 */
var webpack = require('webpack');
var OpenBrowserPlugin = require('open-browser-webpack-plugin');
module.exports = {
    output: {
        filename: "js/[name].js",
        chunkFilename: 'js/[name].js',
        publicPath: "/"
    },
    module: {
        loaders: [
            {
                test: /\.js$/,
                loader: "eslint-loader",
                query: {presets: ['es2015', 'vue'],formatter: require('eslint-friendly-formatter')},
                exclude: /node_modules/
            },
        ],
    },
    plugins: [
        // 启动热替换
        new webpack.HotModuleReplacementPlugin(),
        // new OpenBrowserPlugin({
        //     url: 'http://localhost:9080'
        // }),

    ],
    devtool : 'source-map',
    devServer : {
        port: 9080,
        contentBase: './dist',
        hot: true,
        historyApiFallback: true,
        disableHostCheck: true,
        publicPath: "",
        stats: {
            colors: true
        },
        proxy: {
            '/api': {
                target: 'http://10.81.1.31:8779',
                // pathRewrite: {'^/api/doctool/': '/'},
                changeOrigin: true,
                secure: false,
                // headers:{Cookie:'doctool.tk=110a6e047d5bdca2db0b9012d8b68383'}
            },
        }
    }
}
