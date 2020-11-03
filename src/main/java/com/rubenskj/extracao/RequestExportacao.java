package com.rubenskj.extracao;

public class RequestExportacao {

    private String id;
    private String uuid;
    private String chaveAcesso;
    private TipoExportacao tipoExportacao;
    private String conteudo;

    public RequestExportacao() {
    }

    public RequestExportacao(String id, String uuid, String chaveAcesso, TipoExportacao tipoExportacao, String conteudo) {
        this.id = id;
        this.uuid = uuid;
        this.chaveAcesso = chaveAcesso;
        this.tipoExportacao = tipoExportacao;
        this.conteudo = conteudo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public TipoExportacao getTipoExportacao() {
        return tipoExportacao;
    }

    public void setTipoExportacao(TipoExportacao tipoExportacao) {
        this.tipoExportacao = tipoExportacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "RequestExportacao{" +
                "id='" + id + '\'' +
                ", uuid='" + uuid + '\'' +
                ", chaveAcesso='" + chaveAcesso + '\'' +
                ", tipoExportacao=" + tipoExportacao +
                ", conteudo='" + conteudo + '\'' +
                '}';
    }
}
