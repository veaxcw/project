package com.bilibili.main.model;

public class ShoppingCart {
    private String cartId;

    private String userName;

    private String shoppingId;

    private String shopppingName;

    private String shoppingImage;

    private String shoppingPrice;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId == null ? null : cartId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(String shoppingId) {
        this.shoppingId = shoppingId == null ? null : shoppingId.trim();
    }

    public String getShopppingName() {
        return shopppingName;
    }

    public void setShopppingName(String shopppingName) {
        this.shopppingName = shopppingName == null ? null : shopppingName.trim();
    }

    public String getShoppingImage() {
        return shoppingImage;
    }

    public void setShoppingImage(String shoppingImage) {
        this.shoppingImage = shoppingImage == null ? null : shoppingImage.trim();
    }

    public String getShoppingPrice() {
        return shoppingPrice;
    }

    public void setShoppingPrice(String shoppingPrice) {
        this.shoppingPrice = shoppingPrice == null ? null : shoppingPrice.trim();
    }
}