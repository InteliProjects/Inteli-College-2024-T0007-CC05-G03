//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.02.22 at 08:27:36 PM UTC
//


package inteli.xml.sudeste;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}codigoCliente" minOccurs="0"/&gt;
 *         &lt;element ref="{}codigoEnsaio"/&gt;
 *         &lt;element ref="{}codigoGrandeza"/&gt;
 *         &lt;element ref="{}codigoNaturezaEnsaio"/&gt;
 *         &lt;element ref="{}codigoProduto"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}criticidadeMaxima"/&gt;
 *           &lt;element ref="{}criticidadeMinima"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}dataInicioVigencia"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idEloCadeiaProducao" minOccurs="0"/&gt;
 *         &lt;element ref="{}tipoRegistro"/&gt;
 *         &lt;element ref="{}valorIndicadoEmbarque" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorIndicadoOperacional" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorLimiteInferiorContratual" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorLimiteInferiorEmbarque" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorLimiteInferiorOperacional" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorLimiteSuperiorEmbarque" minOccurs="0"/&gt;
 *         &lt;element ref="{}valorLimiteSuperiorOperacional" minOccurs="0"/&gt;
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
    "codigoCliente",
    "codigoEnsaio",
    "codigoGrandeza",
    "codigoNaturezaEnsaio",
    "codigoProduto",
    "criticidadeMaxima",
    "criticidadeMinima",
    "dataInicioVigencia",
    "id",
    "idEloCadeiaProducao",
    "tipoRegistro",
    "valorIndicadoEmbarque",
    "valorIndicadoOperacional",
    "valorLimiteInferiorContratual",
    "valorLimiteInferiorEmbarque",
    "valorLimiteInferiorOperacional",
    "valorLimiteSuperiorEmbarque",
    "valorLimiteSuperiorOperacional"
})
@XmlRootElement(name = "especificacaoPlanejamento")
public class EspecificacaoPlanejamento {

    protected String codigoCliente;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoEnsaio;
    @XmlElement(required = true)
    protected String codigoGrandeza;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoNaturezaEnsaio;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoProduto;
    protected BigInteger criticidadeMaxima;
    protected BigInteger criticidadeMinima;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicioVigencia;
    @XmlElement(required = true)
    protected Id id;
    protected BigInteger idEloCadeiaProducao;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoRegistro;
    protected BigDecimal valorIndicadoEmbarque;
    protected BigDecimal valorIndicadoOperacional;
    protected BigDecimal valorLimiteInferiorContratual;
    protected BigDecimal valorLimiteInferiorEmbarque;
    protected BigDecimal valorLimiteInferiorOperacional;
    protected BigDecimal valorLimiteSuperiorEmbarque;
    protected BigDecimal valorLimiteSuperiorOperacional;

    /**
     * Gets the value of the codigoCliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Sets the value of the codigoCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoCliente(String value) {
        this.codigoCliente = value;
    }

    /**
     * Gets the value of the codigoEnsaio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoEnsaio() {
        return codigoEnsaio;
    }

    /**
     * Sets the value of the codigoEnsaio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoEnsaio(String value) {
        this.codigoEnsaio = value;
    }

    /**
     * Gets the value of the codigoGrandeza property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoGrandeza() {
        return codigoGrandeza;
    }

    /**
     * Sets the value of the codigoGrandeza property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoGrandeza(String value) {
        this.codigoGrandeza = value;
    }

    /**
     * Gets the value of the codigoNaturezaEnsaio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoNaturezaEnsaio() {
        return codigoNaturezaEnsaio;
    }

    /**
     * Sets the value of the codigoNaturezaEnsaio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoNaturezaEnsaio(String value) {
        this.codigoNaturezaEnsaio = value;
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
     * Gets the value of the criticidadeMaxima property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCriticidadeMaxima() {
        return criticidadeMaxima;
    }

    /**
     * Sets the value of the criticidadeMaxima property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCriticidadeMaxima(BigInteger value) {
        this.criticidadeMaxima = value;
    }

    /**
     * Gets the value of the criticidadeMinima property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCriticidadeMinima() {
        return criticidadeMinima;
    }

    /**
     * Sets the value of the criticidadeMinima property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCriticidadeMinima(BigInteger value) {
        this.criticidadeMinima = value;
    }

    /**
     * Gets the value of the dataInicioVigencia property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    /**
     * Sets the value of the dataInicioVigencia property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDataInicioVigencia(XMLGregorianCalendar value) {
        this.dataInicioVigencia = value;
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
     * Gets the value of the tipoRegistro property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoRegistro() {
        return tipoRegistro;
    }

    /**
     * Sets the value of the tipoRegistro property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoRegistro(String value) {
        this.tipoRegistro = value;
    }

    /**
     * Gets the value of the valorIndicadoEmbarque property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorIndicadoEmbarque() {
        return valorIndicadoEmbarque;
    }

    /**
     * Sets the value of the valorIndicadoEmbarque property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorIndicadoEmbarque(BigDecimal value) {
        this.valorIndicadoEmbarque = value;
    }

    /**
     * Gets the value of the valorIndicadoOperacional property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorIndicadoOperacional() {
        return valorIndicadoOperacional;
    }

    /**
     * Sets the value of the valorIndicadoOperacional property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorIndicadoOperacional(BigDecimal value) {
        this.valorIndicadoOperacional = value;
    }

    /**
     * Gets the value of the valorLimiteInferiorContratual property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorLimiteInferiorContratual() {
        return valorLimiteInferiorContratual;
    }

    /**
     * Sets the value of the valorLimiteInferiorContratual property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorLimiteInferiorContratual(BigDecimal value) {
        this.valorLimiteInferiorContratual = value;
    }

    /**
     * Gets the value of the valorLimiteInferiorEmbarque property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorLimiteInferiorEmbarque() {
        return valorLimiteInferiorEmbarque;
    }

    /**
     * Sets the value of the valorLimiteInferiorEmbarque property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorLimiteInferiorEmbarque(BigDecimal value) {
        this.valorLimiteInferiorEmbarque = value;
    }

    /**
     * Gets the value of the valorLimiteInferiorOperacional property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorLimiteInferiorOperacional() {
        return valorLimiteInferiorOperacional;
    }

    /**
     * Sets the value of the valorLimiteInferiorOperacional property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorLimiteInferiorOperacional(BigDecimal value) {
        this.valorLimiteInferiorOperacional = value;
    }

    /**
     * Gets the value of the valorLimiteSuperiorEmbarque property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorLimiteSuperiorEmbarque() {
        return valorLimiteSuperiorEmbarque;
    }

    /**
     * Sets the value of the valorLimiteSuperiorEmbarque property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorLimiteSuperiorEmbarque(BigDecimal value) {
        this.valorLimiteSuperiorEmbarque = value;
    }

    /**
     * Gets the value of the valorLimiteSuperiorOperacional property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorLimiteSuperiorOperacional() {
        return valorLimiteSuperiorOperacional;
    }

    /**
     * Sets the value of the valorLimiteSuperiorOperacional property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorLimiteSuperiorOperacional(BigDecimal value) {
        this.valorLimiteSuperiorOperacional = value;
    }

}
