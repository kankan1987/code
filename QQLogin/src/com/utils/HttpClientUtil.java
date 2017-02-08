package com.utils;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import org.apache.commons.httpclient.params.HttpParams;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpClientUtil {

    private static Logger log = LoggerFactory.getLogger(HttpClientUtil.class);

    public static String post(String url, Map<String, String> params) throws ParseException, IOException {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        //httpclient.getParams() ;
        HttpParams paramsConnection = httpclient.getParams();
        HttpConnectionParams.setConnectionTimeout(paramsConnection, 1000*60);
        HttpConnectionParams.setSoTimeout(paramsConnection, 1000*60);
        //Integer CONNECTION_TIMEOUT = 2 * 1000; //设置请求超时2秒钟 根据业务调整
        //Integer SO_TIMEOUT = 2 * 1000; //设置等待数据超时时间2秒钟 根据业务调整

        String body = null;
        //log.debug("create http post:" + url);
        HttpPost post = postForm(url, params);

        body = invoke(httpclient, post);

        httpclient.getConnectionManager().shutdown();

        return body;
    }

    public static String get(String url) throws ParseException, IOException {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        String body = null;

        log.debug("http->" + url);
        HttpGet get = new HttpGet(url);

        HttpParams params = (HttpParams) httpclient.getParams();
        //方式一
        HttpConnectionParams.setConnectionTimeout(params, 1000*600);
        HttpConnectionParams.setSoTimeout(params, 1000*600);

        body = invoke(httpclient, get);
        httpclient.getConnectionManager().shutdown();
        return body;
    }

    private static String invoke(DefaultHttpClient httpclient,
                                 HttpUriRequest httpost) throws ParseException, IOException {

        HttpResponse response = sendRequest(httpclient, httpost);
        String body = paseResponse(response);

        return body;
    }

    private static String paseResponse(HttpResponse response) throws ParseException, IOException {
        //log.info("get response from http server..");
        HttpEntity entity = response.getEntity();

        //log.info("response status: " + response.getStatusLine());
        String charset = EntityUtils.getContentCharSet(entity);
        //log.info(charset);

        String body = null;
        body = EntityUtils.toString(entity);
        //log.info(body);

        return body;
    }

    private static HttpResponse sendRequest(DefaultHttpClient httpclient,
                                            HttpUriRequest httpost) throws ClientProtocolException, IOException {
        //log.info("execute post...");

        return httpclient.execute(httpost);
    }

    private static HttpPost postForm(String url, Map<String, String> params) throws UnsupportedEncodingException {

        HttpPost httpost = new HttpPost(url);
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();

        Set<String> keySet = params.keySet();
        for (String key : keySet) {
            nvps.add(new BasicNameValuePair(key, params.get(key)));
        }

        //log.info("set utf-8 form entity to httppost");
        httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

        return httpost;
    }
}
