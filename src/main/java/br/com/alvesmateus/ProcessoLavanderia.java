package br.com.alvesmateus;

import java.util.ArrayList;
import java.util.List;

public abstract class ProcessoLavanderia {
    public final List<String> processarPedido() {
        List<String> relatorio = new ArrayList<>();

        relatorio.add(receberRoupas());
        relatorio.add(lavar());
        relatorio.add(secar());
        relatorio.add(passar());
        relatorio.add(entregar());

        return relatorio;
    }

    private String receberRoupas() {
        return "1. Roupas recebidas, pesadas e triadas.";
    }

    private String passar() {
        return "4. Roupas passadas, dobradas e embaladas.";
    }

    private String entregar() {
        return "5. Roupas entregues ao cliente.";
    }

    protected abstract String lavar();
    protected abstract String secar();
}
