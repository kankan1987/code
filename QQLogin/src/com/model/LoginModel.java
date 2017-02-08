package com.model;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class LoginModel {
	
	//first step
	private String appid;		
	private String ptTea;
	private String ptVcode;
	private String r;
	private String regmaster;
	private String uin;
	
	//second step
	private String action;
	private String aid;
	private String daid;
	private String fromUi;
	private String g;
	private String h;
	private String p;
	private String ptRandsalt;
	private String ptVcodeV1;
	private String ptVerifysessionV1;
	private String ptlang;
	private String ptredirect;
	private String t;
	private String u;
	private String verifycode;
	
	private String apptype = "2";
	
	//图片验证
	private String uid;
	private String asig;
	private String capCd;
	private String captype;
	private String clientype = "2";
	private String curenv = "inner";
	private String disturblevel;
	private String ischartype;
	private String lang = "2052";
	private String noBorder ="noborder";
	private String protocol = "http";
	private String rand;
	private String rnd;
	private String showtype = "embed";
	private String vsig;
	
	//设置验证码
	private String ans;
	private String cdata;
	private String collect;
	private String subcapclass = "0";
	
	
	//common param
	private String loginSig;
	private String jsType;
	private String jsVer;
	private String ptUistyle;
	private String u1="http://qzs.qq.com/qzone/v5/loginsucc.html?para=izone";
	
	
	//call url
	private String stepFirstUrl = "http://check.ptlogin2.qq.com/check";
	private String stepSecondUrl = "http://ptlogin2.qq.com/login";
	
	//check code url
	private String checkCodeUrl = "http://captcha.qq.com/cap_union_new_getcapbysig";
	//set code url
	private String setCodeUrl = "http://captcha.qq.com/cap_union_new_verify";
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getPtTea() {
		return ptTea;
	}
	public void setPtTea(String ptTea) {
		this.ptTea = ptTea;
	}
	public String getPtVcode() {
		return ptVcode;
	}
	public void setPtVcode(String ptVcode) {
		this.ptVcode = ptVcode;
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	public String getRegmaster() {
		return regmaster;
	}
	public void setRegmaster(String regmaster) {
		this.regmaster = regmaster;
	}
	public String getUin() {
		return uin;
	}
	public void setUin(String uin) {
		this.uin = uin;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getDaid() {
		return daid;
	}
	public void setDaid(String daid) {
		this.daid = daid;
	}
	public String getFromUi() {
		return fromUi;
	}
	public void setFromUi(String fromUi) {
		this.fromUi = fromUi;
	}
	public String getG() {
		return g;
	}
	public void setG(String g) {
		this.g = g;
	}
	public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public String getPtRandsalt() {
		return ptRandsalt;
	}
	public void setPtRandsalt(String ptRandsalt) {
		this.ptRandsalt = ptRandsalt;
	}
	public String getPtVcodeV1() {
		return ptVcodeV1;
	}
	public void setPtVcodeV1(String ptVcodeV1) {
		this.ptVcodeV1 = ptVcodeV1;
	}
	public String getPtVerifysessionV1() {
		return ptVerifysessionV1;
	}
	public void setPtVerifysessionV1(String ptVerifysessionV1) {
		this.ptVerifysessionV1 = ptVerifysessionV1;
	}
	public String getPtlang() {
		return ptlang;
	}
	public void setPtlang(String ptlang) {
		this.ptlang = ptlang;
	}
	public String getPtredirect() {
		return ptredirect;
	}
	public void setPtredirect(String ptredirect) {
		this.ptredirect = ptredirect;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getU() {
		return u;
	}
	public void setU(String u) {
		this.u = u;
	}
	public String getVerifycode() {
		return verifycode;
	}
	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}
	public String getLoginSig() {
		return loginSig;
	}
	public void setLoginSig(String loginSig) {
		this.loginSig = loginSig;
	}
	public String getJsType() {
		return jsType;
	}
	public void setJsType(String jsType) {
		this.jsType = jsType;
	}
	public String getJsVer() {
		return jsVer;
	}
	public void setJsVer(String jsVer) {
		this.jsVer = jsVer;
	}
	public String getPtUistyle() {
		return ptUistyle;
	}
	public void setPtUistyle(String ptUistyle) {
		this.ptUistyle = ptUistyle;
	}
	public String getU1() {
		return u1;
	}
	public void setU1(String u1) {
		this.u1 = u1;
	}
	public String getStepFirstUrl() {
		return stepFirstUrl;
	}
	public void setStepFirstUrl(String stepFirstUrl) {
		this.stepFirstUrl = stepFirstUrl;
	}
	public String getStepSecondUrl() {
		return stepSecondUrl;
	}
	public void setStepSecondUrl(String stepSecondUrl) {
		this.stepSecondUrl = stepSecondUrl;
	}

	
	
	public String getApptype() {
		return apptype;
	}
	public void setApptype(String apptype) {
		this.apptype = apptype;
	}
	public String getAsig() {
		return asig;
	}
	public void setAsig(String asig) {
		this.asig = asig;
	}
	public String getCapCd() {
		return capCd;
	}
	public void setCapCd(String capCd) {
		this.capCd = capCd;
	}
	public String getCaptype() {
		return captype;
	}
	public void setCaptype(String captype) {
		this.captype = captype;
	}
	public String getClientype() {
		return clientype;
	}
	public void setClientype(String clientype) {
		this.clientype = clientype;
	}
	public String getCurenv() {
		return curenv;
	}
	public void setCurenv(String curenv) {
		this.curenv = curenv;
	}
	public String getDisturblevel() {
		return disturblevel;
	}
	public void setDisturblevel(String disturblevel) {
		this.disturblevel = disturblevel;
	}
	public String getIschartype() {
		return ischartype;
	}
	public void setIschartype(String ischartype) {
		this.ischartype = ischartype;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getNoBorder() {
		return noBorder;
	}
	public void setNoBorder(String noBorder) {
		this.noBorder = noBorder;
	}
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getRand() {
		return rand;
	}
	public void setRand(String rand) {
		this.rand = rand;
	}
	public String getRnd() {
		return rnd;
	}
	public void setRnd(String rnd) {
		this.rnd = rnd;
	}
	public String getShowtype() {
		return showtype;
	}
	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}
	public String getVsig() {
		return vsig;
	}
	public void setVsig(String vsig) {
		this.vsig = vsig;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getCdata() {
		return cdata;
	}
	public void setCdata(String cdata) {
		this.cdata = cdata;
	}
	public String getCollect() {
		return collect;
	}
	public void setCollect(String collect) {
		this.collect = collect;
	}
	public String getSubcapclass() {
		return subcapclass;
	}
	public void setSubcapclass(String subcapclass) {
		this.subcapclass = subcapclass;
	}
	//Assembly param step1
	public String getCallSeptFirstUrl() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.stepFirstUrl).append("?").append("regmaster=");
		sb.append("&appid=").append(this.appid)
		  .append("&js_type=").append(this.jsType)
		  .append("&js_ver=").append(this.jsVer)
		  .append("&login_sig=").append(this.loginSig)
		  .append("&pt_tea=").append(this.ptTea)
		  .append("&pt_uistyle=").append(this.ptUistyle)
		  .append("&pt_vcode=").append(this.ptVcode)
		  .append("&r=").append(this.r)
		  .append("&u1=").append(URLEncoder.encode(this.u1))
		  .append("&uin=").append(this.uin);
		
		return sb.toString();
	}
	
	public String getCallCheckCodeUrl() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.checkCodeUrl).append("?")
		  .append("aid=").append(this.aid)
		  .append("&apptype=").append(this.apptype)
		  .append("&asig=")
		  .append("&cap_cd=").append(this.capCd)
		  .append("&captype=")
		  .append("&clientype=").append(this.clientype)
		  .append("&curenv=").append(this.curenv)
		  .append("&disturblevel=")
		  .append("&ischartype=").append(this.ischartype)
		  .append("&lang=").append(this.lang)
		  .append("&noBorder=").append(this.noBorder)
		  .append("&protocol=").append(this.protocol)
		  .append("&rand=").append(this.rand)
		  .append("&rnd=").append(this.rnd)
		  .append("&showtype=").append(this.showtype)
		  .append("&uid=").append(this.uid)
		  .append("&vsig=").append(this.vsig);
		  ;
		return sb.toString();
	}
	
	public String getCallSetCodeUrl() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.setCodeUrl).append("?random=").append(Math.random());
		return sb.toString();
	}
	
	public Map getCallSetCodeParam() {
		Map param = new HashMap();
		param.put("aid", this.aid);
		param.put("ans", this.ans);
		param.put("apptype", this.apptype);
		param.put("asig", "");
		param.put("cap_cd", this.capCd);
		param.put("captype", "");
		param.put("cdata", this.cdata);
		param.put("clientype", this.clientype);
		param.put("collect", this.collect);
		param.put("curenv", this.curenv);
		param.put("disturblevel", "");
		param.put("lang", this.lang);
		param.put("noBorder", this.noBorder);
		param.put("protocol", this.protocol);
		param.put("rnd", this.rnd);
		param.put("showtype", this.showtype);
		param.put("subcapclass", this.subcapclass);
		param.put("uid", this.uid);
		param.put("vsig", this.vsig);
		
		return param;
	}
	
	//Assembly param step2
	private String getCallSeptSecondUrl() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.stepSecondUrl).append("?");
		sb.append("action=").append(this.action)
		  .append("&aid=").append(this.aid)
		  .append("&daid=").append(this.daid)
		  .append("&from_ui=").append(this.fromUi)
		  .append("&g=").append(this.g)
		  .append("&h=").append(this.h)
		  .append("&js_type=").append(this.jsType)
		  .append("&js_ver=").append(this.jsVer)
		  .append("login_sig=").append(this.loginSig)
		  .append("&p=").append(this.p)
		  .append("&pt_randsalt").append(this.ptRandsalt)
		  .append("&pt_uistyle").append(this.ptUistyle)
		  .append("&pt_vcode_v1").append(this.ptVcodeV1)
		  .append("&pt_verifysession_v1=").append(this.ptVerifysessionV1)
		  .append("&ptlang").append(this.ptlang)
		  .append("&ptredirect").append(this.ptredirect)
		  .append("&t=").append(this.t)
		  .append("&u=").append(this.u)
		  .append("&u1=").append(URLEncoder.encode(this.u1))
		  .append("&verifycode=").append(this.verifycode);
		
		return sb.toString();
	}
}
