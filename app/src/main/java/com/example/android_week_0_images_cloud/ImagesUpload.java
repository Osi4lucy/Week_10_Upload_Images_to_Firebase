package com.example.android_week_0_images_cloud;

public class ImagesUpload {
    private String imageName;
    private String imageUrl;

    public ImagesUpload(){

    }

    public ImagesUpload(String imageName, String imageUrl) {
        if(imageName.trim().equals("")) {
            imageName = "No title entered";
        }
        this.imageName = imageName;
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
