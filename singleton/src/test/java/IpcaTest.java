import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IpcaTest {

    @Test
    public void deveRetornarIpcaAtual() {
        Ipca.getInstance().setCurrentIpcaIndex(0.23f);
        assertEquals(0.23f, Ipca.getInstance().getCurrentIpcaIndex());
    }

    @Test
    public void deveRetornarIpcaAcumulado() {
        Ipca.getInstance().setAccumulatedIndexIpca(0.23f);
        assertEquals(0.23f, Ipca.getInstance().getAccumulatedIndexIpca());
    }
}