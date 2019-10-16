public class Assistant {
    private Camera camera;
    private CameraRoll cameraRoll = new ColorCameraRoll();

    public void setCameraRoll(CameraRoll cameraRoll){
        this.cameraRoll = cameraRoll;
    }

    public Camera getCamera() {
        return camera;
    }
}
