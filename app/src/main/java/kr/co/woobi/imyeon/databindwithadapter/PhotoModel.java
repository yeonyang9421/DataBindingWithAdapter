package kr.co.woobi.imyeon.databindwithadapter;

public class PhotoModel {
    private int image;
    private String title;

    public PhotoModel(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PhotoModel{");
        sb.append("image=").append(image);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
