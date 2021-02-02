package net.tecgurus.guruday.service;

import net.tecgurus.guruday.exception.BaseException;
import net.tecgurus.guruday.exception.BaseRuntimeException;
import net.tecgurus.guruday.service.impl.EmailNotifier;
import org.junit.Assert;
import org.junit.Test;

public class NotifierTest {

    /**
     *En una prueba unitaria debemos probar diferentes escenarios, no solo el happy path
     *
     */

    @Test(expected = BaseException.class)
    public void cuandoSePresentaElEscenarioExcepcionalEntoncesSeDebeLanzarLaExcepcion() throws BaseException {
        new EmailNotifier().sendNotification("", null);
    }

    @Test(expected = BaseRuntimeException.class)
    public void cuandoSePresentaElEscenarioExcepcionalEntoncesSeDebeLanzarLaExcepcionTipoRuntime() {
        new EmailNotifier().sendNotification2("", null);
    }

    @Test
    public void notificacionEnviadaCorrectamente() throws BaseException {//Happy Path
        Assert.assertTrue(new EmailNotifier().sendNotification("",""));
    }

}
