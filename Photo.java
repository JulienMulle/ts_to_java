public class Photo {
    public String url;
    public String filename;
    public int width;
    public int height;

    public Photo(String url, String filename, int width, int height) {
        this.url = url;
        this.filename = filename;
        this.width = width;
        this.height = height;
    }


    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
