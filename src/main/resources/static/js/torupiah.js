(function (f) { if (typeof exports === "object" && typeof module !== "undefined") { module.exports = f() } else if (typeof define === "function" && define.amd) { define([], f) } else { var g; if (typeof window !== "undefined") { g = window } else if (typeof global !== "undefined") { g = global } else if (typeof self !== "undefined") { g = self } else { g = this } g.toRupiah = f() } })(function () {
    var define, module, exports; return (function () { function r(e, n, t) { function o(i, f) { if (!n[i]) { if (!e[i]) { var c = "function" == typeof require && require; if (!f && c) return c(i, !0); if (u) return u(i, !0); var a = new Error("Cannot find module '" + i + "'"); throw a.code = "MODULE_NOT_FOUND", a } var p = n[i] = { exports: {} }; e[i][0].call(p.exports, function (r) { var n = e[i][1][r]; return o(n || r) }, p, p.exports, r, e, n, t) } return n[i].exports } for (var u = "function" == typeof require && require, i = 0; i < t.length; i++)o(t[i]); return o } return r })()({
        1: [function (require, module, exports) {
            "use strict"; var commaFormatter = function (t, r) { if (t) { var e = r.floatingPoint - t.length; if (e > 0) for (var o = 0; o < r.floatingPoint - t.length; o++)t += "0"; else e < 0 && (t = t.slice(0, e)) } else t = r.replaceZeroDecimals ? "-" : "00"; return t }, dotsFormatter = function (t, r) { for (var e = t.split("."), o = e[0].length, n = e[0].split(""), i = o - 1; i >= 0; i--)(o - i) % 3 == 0 && i > 0 && (n[i] = r.dot + n[i]); var l = n.join(""), a = commaFormatter(e[1] || null, r); return r.floatingPoint > 0 ? l + r.decimal + a : l }, symbolFormatter = function (t, r) { return "Rp" === r.symbol ? t = r.formal ? "Rp" + t : "Rp " + t : "IDR" === r.symbol && (t = r.formal ? t + " IDR" : "IDR " + t), t }, unitFormatter = function (t, r) { var e = r.longUnit ? ["ribu", "juta", "miliar", "triliun"] : [r.k ? "k" : "rb", "jt", "M", "T"], o = Math.ceil(t.length / 3) - 2, n = null; if (o >= 0 && o < 4) { var i = e[o]; r.spaceBeforeUnit && (i = " " + i); var l = t.length % 3, a = 0 === l ? 3 : l; n = t.substr(0, a), n += (o >= 0 && r.floatingPoint > 0 ? r.decimal : "") + t.substr(a, r.floatingPoint) + i } else n = dotsFormatter(t, r); return n }, defaultSettings = { symbol: "Rp", formal: !0, dot: ".", decimal: ",", floatingPoint: 2, replaceZeroDecimals: !1, k: !1, useUnit: !1, longUnit: !1, spaceBeforeUnit: !1 }; module.exports = function (t) { var r = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : {}; return t = "string" != typeof t ? t.toString() : t, (r = Object.assign({}, defaultSettings, r)).useUnit ? symbolFormatter(unitFormatter(t, r), r) : symbolFormatter(dotsFormatter(t, r), r) };

        }, {}]
    }, {}, [1])(1)
});