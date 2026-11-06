package io.branch.referral.util;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class Product {
    private String brand;
    private ProductCategory category;
    private String name;
    private Double price;
    private Integer quantity;
    private String sku;
    private String variant;

    public Product(String str, String str2, Double d, Integer num, String str3, String str4, ProductCategory productCategory) {
        this.sku = str;
        this.name = str2;
        this.price = d;
        this.quantity = num;
        this.brand = str3;
        this.variant = str4;
        this.category = productCategory;
    }

    public String getBrand() {
        return this.brand;
    }

    public ProductCategory getCategory() {
        return this.category;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public JSONObject getProductJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sku", this.sku);
            jSONObject.put("name", this.name);
            jSONObject.put("price", this.price);
            jSONObject.put("quantity", this.quantity);
            jSONObject.put("brand", this.brand);
            jSONObject.put("variant", this.variant);
            jSONObject.put("category", this.category);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public String getSku() {
        return this.sku;
    }

    public String getVariant() {
        return this.variant;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCategory(ProductCategory productCategory) {
        this.category = productCategory;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrice(Double d) {
        this.price = d;
    }

    public void setQuantity(Integer num) {
        this.quantity = num;
    }

    public void setSku(String str) {
        this.sku = str;
    }

    public void setVariant(String str) {
        this.variant = str;
    }

    public Product() {
    }
}
