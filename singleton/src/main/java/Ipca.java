// Índice de preços no consumidor é usado para observar tendências de inflação.

public class Ipca {

    private Ipca() {
    }

    private static Ipca instance = new Ipca();

    public static Ipca getInstance() {
        return instance;
    }

    private float currentIpcaIndex;
    private float accumulatedIpcaIndex;

    public float getCurrentIpcaIndex() {
        return this.currentIpcaIndex;
    }

    public void setCurrentIpcaIndex(float ipcaIndex) {
        this.currentIpcaIndex = ipcaIndex;
    }

    public float getAccumulatedIndexIpca() {
        return this.accumulatedIpcaIndex;
    }

    public void setAccumulatedIndexIpca(float ipcaIndex) {
        this.accumulatedIpcaIndex = ipcaIndex;
    }
}