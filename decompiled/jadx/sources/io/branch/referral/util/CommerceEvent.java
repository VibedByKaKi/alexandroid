package io.branch.referral.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class CommerceEvent {
    private String affiliation;
    private String coupon;
    private CurrencyType currencyType;
    private List<Product> products;
    private Double revenue;
    private Double shipping;
    private Double tax;
    private String transactionID;

    public CommerceEvent(Double d, CurrencyType currencyType, String str, Double d2, Double d3, String str2, String str3, Product product) {
        this.revenue = d;
        this.currencyType = currencyType;
        this.transactionID = str;
        this.shipping = d2;
        this.tax = d3;
        this.coupon = str2;
        this.affiliation = str3;
        ArrayList arrayList = new ArrayList();
        this.products = arrayList;
        arrayList.add(product);
    }

    public void addProduct(Product product) {
        if (this.products == null) {
            this.products = new ArrayList();
        }
        this.products.add(product);
    }

    public String getAffiliation() {
        return this.affiliation;
    }

    public JSONObject getCommerceJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("revenue", this.revenue);
            jSONObject.put("currency", this.currencyType);
            jSONObject.put("transaction_id", this.transactionID);
            jSONObject.put("shipping", this.shipping);
            jSONObject.put("tax", this.tax);
            jSONObject.put("coupon", this.coupon);
            jSONObject.put("affiliation", this.affiliation);
            if (getProducts() != null) {
                jSONObject.put("products", (Object) getProducts());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String getCoupon() {
        return this.coupon;
    }

    public CurrencyType getCurrencyType() {
        return this.currencyType;
    }

    public List<JSONObject> getProducts() {
        if (this.products == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Product> it2 = this.products.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getProductJSONObject());
        }
        return arrayList;
    }

    public Double getRevenue() {
        return this.revenue;
    }

    public Double getShipping() {
        return this.shipping;
    }

    public Double getTax() {
        return this.tax;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public void setAffiliation(String str) {
        this.affiliation = str;
    }

    public void setCoupon(String str) {
        this.coupon = str;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public void setProducts(List<Product> list) {
        this.products = list;
    }

    public void setRevenue(Double d) {
        this.revenue = d;
    }

    public void setShipping(Double d) {
        this.shipping = d;
    }

    public void setTax(Double d) {
        this.tax = d;
    }

    public void setTransactionID(String str) {
        this.transactionID = str;
    }

    public CommerceEvent(Double d, CurrencyType currencyType, String str, Double d2, Double d3, String str2, String str3, List<Product> list) {
        this.revenue = d;
        this.currencyType = currencyType;
        this.transactionID = str;
        this.shipping = d2;
        this.tax = d3;
        this.coupon = str2;
        this.affiliation = str3;
        this.products = list;
    }

    public CommerceEvent() {
    }
}
