//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.02.22 at 08:27:36 PM UTC
//


package inteli.xml.sudeste;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}calculoPreco"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}codigoCategoriaProduto"/&gt;
 *           &lt;element ref="{}codigoProduto"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idEloCadeiaProducao"/&gt;
 *         &lt;element ref="{}quebraLoteExpedicao"/&gt;
 *         &lt;element ref="{}recebimentoProdutoAbril"/&gt;
 *         &lt;element ref="{}recebimentoProdutoAgosto"/&gt;
 *         &lt;element ref="{}recebimentoProdutoDezembro"/&gt;
 *         &lt;element ref="{}recebimentoProdutoFevereiro"/&gt;
 *         &lt;element ref="{}recebimentoProdutoJaneiro"/&gt;
 *         &lt;element ref="{}recebimentoProdutoJulho"/&gt;
 *         &lt;element ref="{}recebimentoProdutoJunho"/&gt;
 *         &lt;element ref="{}recebimentoProdutoMaio"/&gt;
 *         &lt;element ref="{}recebimentoProdutoMarco"/&gt;
 *         &lt;element ref="{}recebimentoProdutoNovembro"/&gt;
 *         &lt;element ref="{}recebimentoProdutoOutubro"/&gt;
 *         &lt;element ref="{}recebimentoProdutoSetembro"/&gt;
 *         &lt;element ref="{}tipoAssociacao"/&gt;
 *         &lt;element ref="{}valorPrioridade" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "calculoPreco",
    "codigoCategoriaProduto",
    "codigoProduto",
    "id",
    "idEloCadeiaProducao",
    "quebraLoteExpedicao",
    "recebimentoProdutoAbril",
    "recebimentoProdutoAgosto",
    "recebimentoProdutoDezembro",
    "recebimentoProdutoFevereiro",
    "recebimentoProdutoJaneiro",
    "recebimentoProdutoJulho",
    "recebimentoProdutoJunho",
    "recebimentoProdutoMaio",
    "recebimentoProdutoMarco",
    "recebimentoProdutoNovembro",
    "recebimentoProdutoOutubro",
    "recebimentoProdutoSetembro",
    "tipoAssociacao",
    "valorPrioridade"
})
@XmlRootElement(name = "associacaoProdutoElo")
public class AssociacaoProdutoElo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String calculoPreco;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoCategoriaProduto;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoProduto;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected BigInteger idEloCadeiaProducao;
    protected boolean quebraLoteExpedicao;
    protected boolean recebimentoProdutoAbril;
    protected boolean recebimentoProdutoAgosto;
    protected boolean recebimentoProdutoDezembro;
    protected boolean recebimentoProdutoFevereiro;
    protected boolean recebimentoProdutoJaneiro;
    protected boolean recebimentoProdutoJulho;
    protected boolean recebimentoProdutoJunho;
    protected boolean recebimentoProdutoMaio;
    protected boolean recebimentoProdutoMarco;
    protected boolean recebimentoProdutoNovembro;
    protected boolean recebimentoProdutoOutubro;
    protected boolean recebimentoProdutoSetembro;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoAssociacao;
    protected BigInteger valorPrioridade;

    /**
     * Gets the value of the calculoPreco property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalculoPreco() {
        return calculoPreco;
    }

    /**
     * Sets the value of the calculoPreco property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalculoPreco(String value) {
        this.calculoPreco = value;
    }

    /**
     * Gets the value of the codigoCategoriaProduto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCategoriaProduto() {
        return codigoCategoriaProduto;
    }

    /**
     * Sets the value of the codigoCategoriaProduto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCategoriaProduto(String value) {
        this.codigoCategoriaProduto = value;
    }

    /**
     * Gets the value of the codigoProduto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * Sets the value of the codigoProduto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoProduto(String value) {
        this.codigoProduto = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Id }
     *
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Id }
     *
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the idEloCadeiaProducao property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdEloCadeiaProducao() {
        return idEloCadeiaProducao;
    }

    /**
     * Sets the value of the idEloCadeiaProducao property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdEloCadeiaProducao(BigInteger value) {
        this.idEloCadeiaProducao = value;
    }

    /**
     * Gets the value of the quebraLoteExpedicao property.
     *
     */
    public boolean isQuebraLoteExpedicao() {
        return quebraLoteExpedicao;
    }

    /**
     * Sets the value of the quebraLoteExpedicao property.
     *
     */
    public void setQuebraLoteExpedicao(boolean value) {
        this.quebraLoteExpedicao = value;
    }

    /**
     * Gets the value of the recebimentoProdutoAbril property.
     *
     */
    public boolean isRecebimentoProdutoAbril() {
        return recebimentoProdutoAbril;
    }

    /**
     * Sets the value of the recebimentoProdutoAbril property.
     *
     */
    public void setRecebimentoProdutoAbril(boolean value) {
        this.recebimentoProdutoAbril = value;
    }

    /**
     * Gets the value of the recebimentoProdutoAgosto property.
     *
     */
    public boolean isRecebimentoProdutoAgosto() {
        return recebimentoProdutoAgosto;
    }

    /**
     * Sets the value of the recebimentoProdutoAgosto property.
     *
     */
    public void setRecebimentoProdutoAgosto(boolean value) {
        this.recebimentoProdutoAgosto = value;
    }

    /**
     * Gets the value of the recebimentoProdutoDezembro property.
     *
     */
    public boolean isRecebimentoProdutoDezembro() {
        return recebimentoProdutoDezembro;
    }

    /**
     * Sets the value of the recebimentoProdutoDezembro property.
     *
     */
    public void setRecebimentoProdutoDezembro(boolean value) {
        this.recebimentoProdutoDezembro = value;
    }

    /**
     * Gets the value of the recebimentoProdutoFevereiro property.
     *
     */
    public boolean isRecebimentoProdutoFevereiro() {
        return recebimentoProdutoFevereiro;
    }

    /**
     * Sets the value of the recebimentoProdutoFevereiro property.
     *
     */
    public void setRecebimentoProdutoFevereiro(boolean value) {
        this.recebimentoProdutoFevereiro = value;
    }

    /**
     * Gets the value of the recebimentoProdutoJaneiro property.
     *
     */
    public boolean isRecebimentoProdutoJaneiro() {
        return recebimentoProdutoJaneiro;
    }

    /**
     * Sets the value of the recebimentoProdutoJaneiro property.
     *
     */
    public void setRecebimentoProdutoJaneiro(boolean value) {
        this.recebimentoProdutoJaneiro = value;
    }

    /**
     * Gets the value of the recebimentoProdutoJulho property.
     *
     */
    public boolean isRecebimentoProdutoJulho() {
        return recebimentoProdutoJulho;
    }

    /**
     * Sets the value of the recebimentoProdutoJulho property.
     *
     */
    public void setRecebimentoProdutoJulho(boolean value) {
        this.recebimentoProdutoJulho = value;
    }

    /**
     * Gets the value of the recebimentoProdutoJunho property.
     *
     */
    public boolean isRecebimentoProdutoJunho() {
        return recebimentoProdutoJunho;
    }

    /**
     * Sets the value of the recebimentoProdutoJunho property.
     *
     */
    public void setRecebimentoProdutoJunho(boolean value) {
        this.recebimentoProdutoJunho = value;
    }

    /**
     * Gets the value of the recebimentoProdutoMaio property.
     *
     */
    public boolean isRecebimentoProdutoMaio() {
        return recebimentoProdutoMaio;
    }

    /**
     * Sets the value of the recebimentoProdutoMaio property.
     *
     */
    public void setRecebimentoProdutoMaio(boolean value) {
        this.recebimentoProdutoMaio = value;
    }

    /**
     * Gets the value of the recebimentoProdutoMarco property.
     *
     */
    public boolean isRecebimentoProdutoMarco() {
        return recebimentoProdutoMarco;
    }

    /**
     * Sets the value of the recebimentoProdutoMarco property.
     *
     */
    public void setRecebimentoProdutoMarco(boolean value) {
        this.recebimentoProdutoMarco = value;
    }

    /**
     * Gets the value of the recebimentoProdutoNovembro property.
     *
     */
    public boolean isRecebimentoProdutoNovembro() {
        return recebimentoProdutoNovembro;
    }

    /**
     * Sets the value of the recebimentoProdutoNovembro property.
     *
     */
    public void setRecebimentoProdutoNovembro(boolean value) {
        this.recebimentoProdutoNovembro = value;
    }

    /**
     * Gets the value of the recebimentoProdutoOutubro property.
     *
     */
    public boolean isRecebimentoProdutoOutubro() {
        return recebimentoProdutoOutubro;
    }

    /**
     * Sets the value of the recebimentoProdutoOutubro property.
     *
     */
    public void setRecebimentoProdutoOutubro(boolean value) {
        this.recebimentoProdutoOutubro = value;
    }

    /**
     * Gets the value of the recebimentoProdutoSetembro property.
     *
     */
    public boolean isRecebimentoProdutoSetembro() {
        return recebimentoProdutoSetembro;
    }

    /**
     * Sets the value of the recebimentoProdutoSetembro property.
     *
     */
    public void setRecebimentoProdutoSetembro(boolean value) {
        this.recebimentoProdutoSetembro = value;
    }

    /**
     * Gets the value of the tipoAssociacao property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoAssociacao() {
        return tipoAssociacao;
    }

    /**
     * Sets the value of the tipoAssociacao property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoAssociacao(String value) {
        this.tipoAssociacao = value;
    }

    /**
     * Gets the value of the valorPrioridade property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getValorPrioridade() {
        return valorPrioridade;
    }

    /**
     * Sets the value of the valorPrioridade property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setValorPrioridade(BigInteger value) {
        this.valorPrioridade = value;
    }

}