!
function(t, e) {
    var n = e(t);
    "undefined" != typeof define && (define.cmd || define.amd) && define(function() {
        return n
    })
} (window,
function(t) {
    function e(e) {
        var n = 0;
        m = !1;
        for (var o = 0; o < e.length; o++) {
            var c = t.document.createElement("script");
            c.type = "text/javascript",
            c.async = !0,
            c.src = e[o],
            c.onload = c.onreadystatechange = function() {
                "undefined" != typeof this.readyState && "loaded" !== this.readyState && "complete" !== this.readyState || (m = ++n >= e.length, m && (g(), g = function() {}))
            },
            t.document.getElementsByTagName("head").item(0).appendChild(c)
        }
    }
    function n() {
        if ("undefined" == typeof JSON.stringify || "undefined" == typeof Messenger || "undefined" == typeof AqSCode) return void(t.console && t.console.log("script onload not ready"));
        var e = f({
            ele: b,
            src: h[0],
            domain: l,
            s_type: h[1],
            s_type_suffix: y,
            uin: v
        },
        E || {});
        j = new AqSCode(e),
        j.listen(S),
        j.start(k),
        j.end($)
    }
    function o() {
        return j.getTicket()
    }
    function c(t, e, o) {
        "function" == typeof e ? (S = e, E = o) : (E = e, E.callback && "function" == typeof E.callback ? S = E.callback: "function" == typeof o && (S = o)),
        E && E.start && "[object Function]" == Object.prototype.toString.call(E.start) && (k = function() {
            E.start && E.start(),
            s.start()
        }),
        E && E.end && "[object Function]" == Object.prototype.toString.call(E.end) && ($ = function() {
            E.end && E.end(),
            s.end()
        }),
        b = t,
        m ? n() : g = n
    }
    function a(t) {
        j && j.refresh && j.refresh(t)
    }
    function i() {
        j && j.destroy && j.destroy()
    }
    function r(t) {
        var e = new AqSCode({
            ele: t,
            src: h[0]
        });
        return e
    }
    var d = {
        add: function(e, n, o) {
            t.document.addEventListener ? e.addEventListener(n, o, !1) : t.document.attachEvent ? e.attachEvent("on" + n, o) : e["on" + n] = o
        },
        remove: function(e, n, o) {
            t.document.removeEventListener ? e.removeEventListener(n, o, !1) : t.document.detachEvent ? e.detachEvent("on" + n, o) : e["on" + n] = null
        }
    },
    f = function(t, e, n) {
        n = n || !1;
        var o = {};
        for (var c in e) t[c] = e[c];
        if (n) {
            for (var c in t) o[c] = t[c];
            return o
        }
        return t
    },
    s = {
        id: 0,
        start: function() {
            this.id || (d.add(t.document, "click", a), this.id = 1)
        },
        end: function() {
            d.remove(t.document, "click", a),
            this.id = 0
        }
    },
    u = "http",
    p = "http://captcha.gtimg.com/2",
    l = "https" == u ? "https://ssl.captcha.qq.com": "http://captcha.qq.com";
    p = "" != p ? p: l;
    var y = "?aid=549000912&captype=&protocol=http&clientype=2&disturblevel=&apptype=2",
    v = "",
    h = [l + "/template/placeholder.html" + y, l + "/cap_union_gettype" + y],
    m = !1,
    g = function() {};
    e([p + "/json2.js", p + "/TCapMsg.js", p + "/TCapIframe.js?v=1.0"]);
    var b, j, E, S = function() {},
    k = function() {
        s.start()
    },
    $ = function() {
        s.end()
    };
    return t.capInit = c,
    t.capGetTicket = o,
    t.capRefresh = a,
    t.capDestroy = i,
    t.CapObj = r,
    {
        capInit: c,
        capGetTicket: o,
        capRefresh: a,
        capDestroy: i
    }
});