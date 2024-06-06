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
 *         &lt;element ref="{}categoriaProduto"/&gt;
 *         &lt;element ref="{}codigoProduto"/&gt;
 *         &lt;element ref="{}dtFimVigencia"/&gt;
 *         &lt;element ref="{}dtInicioVigencia"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idEloCliente" minOccurs="0"/&gt;
 *         &lt;element ref="{}referenciaContrato"/&gt;
 *         &lt;element ref="{}tipoMercado"/&gt;
 *         &lt;element ref="{}unidade"/&gt;
 *         &lt;element ref="{}valorMeritoDemerito"/&gt;
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
    "categoriaProduto",
    "codigoProduto",
    "dtFimVigencia",
    "dtInicioVigencia",
    "id",
    "idEloCliente",
    "referenciaContrato",
    "tipoMercado",
    "unidade",
    "valorMeritoDemerito"
})
@XmlRootElement(name = "meritoDemerito")
public class MeritoDemerito {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String categoriaProduto;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoProduto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtFimVigencia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtInicioVigencia;
    @XmlElement(required = true)
    protected Id id;
    protected BigInteger idEloCliente;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String referenciaContrato;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoMercado;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String unidade;
    @XmlElement(required = true)
    protected BigDecimal valorMeritoDemerito;

    /**
     * Gets the value of the categoriaProduto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    /**
     * Sets the value of the categoriaProduto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoriaProduto(String value) {
        this.categoriaProduto = value;
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
     * Gets the value of the dtFimVigencia property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDtFimVigencia() {
        return dtFimVigencia;
    }

    /**
     * Sets the value of the dtFimVigencia property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDtFimVigencia(XMLGregorianCalendar value) {
        this.dtFimVigencia = value;
    }

    /**
     * Gets the value of the dtInicioVigencia property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDtInicioVigencia() {
        return dtInicioVigencia;
    }

    /**
     * Sets the value of the dtInicioVigencia property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setDtInicioVigencia(XMLGregorianCalendar value) {
        this.dtInicioVigencia = value;
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
     * Gets the value of the idEloCliente property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdEloCliente() {
        return idEloCliente;
    }

    /**
     * Sets the value of the idEloCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdEloCliente(BigInteger value) {
        this.idEloCliente = value;
    }

    /**
     * Gets the value of the referenciaContrato property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReferenciaContrato() {
        return referenciaContrato;
    }

    /**
     * Sets the value of the referenciaContrato property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReferenciaContrato(String value) {
        this.referenciaContrato = value;
    }

    /**
     * Gets the value of the tipoMercado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoMercado() {
        return tipoMercado;
    }

    /**
     * Sets the value of the tipoMercado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoMercado(String value) {
        this.tipoMercado = value;
    }

    /**
     * Gets the value of the unidade property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnidade() {
        return unidade;
    }

    /**
     * Sets the value of the unidade property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnidade(String value) {
        this.unidade = value;
    }

    /**
     * Gets the value of the valorMeritoDemerito property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getValorMeritoDemerito() {
        return valorMeritoDemerito;
    }

    /**
     * Sets the value of the valorMeritoDemerito property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setValorMeritoDemerito(BigDecimal value) {
        this.valorMeritoDemerito = value;
    }

}