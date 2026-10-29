package br.com.alvesmateus;

public class LavagemDelicada extends ProcessoLavanderia {
    @Override
    protected String lavar() {
        return "2. Lavando em modo suave com água fria e sabão neutro.";
    }

    @Override
    protected String secar() {
        return "3. Secando à sombra, sem uso de secadora térmica.";
    }
}
