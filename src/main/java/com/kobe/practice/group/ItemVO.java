package com.kobe.practice.group;

public class ItemVO {

    private Long itemId;

    private String address;

    private String receiver;

    private String pictureUrl;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public ItemVO(Long itemId, String address, String receiver, String pictureUrl) {
        this.itemId = itemId;
        this.address = address;
        this.receiver = receiver;
        this.pictureUrl = pictureUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemVO)) return false;

        ItemVO itemVO = (ItemVO) o;

        if (address != null ? !address.equals(itemVO.address) : itemVO.address != null) return false;
        return receiver != null ? receiver.equals(itemVO.receiver) : itemVO.receiver == null;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ItemVO{" +
                "itemId=" + itemId +
                ", address='" + address + '\'' +
                ", receiver='" + receiver + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                '}';
    }
}
