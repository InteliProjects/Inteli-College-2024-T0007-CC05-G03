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
 *         &lt;element ref="{}codigoBlendagemProduto"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}codigoProduto"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}codigoGrupoProduto"/&gt;
 *             &lt;element ref="{}dataInicioVigencia"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}indicePercentualMaximo" minOccurs="0"/&gt;
 *         &lt;element ref="{}indicePercentualMinimo" minOccurs="0"/&gt;
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
    "codigoBlendagemProduto",
    "codigoProduto",
    "codigoGrupoProduto",
    "dataInicioVigencia",
    "id",
    "indicePercentualMaximo",
    "indicePercentualMinimo"
})
@XmlRootElement(name = "regraBlendagemProduto")
public class RegraBlendagemProduto {

    @XmlElement(required = true)
    protected BigInteger codigoBlendagemProduto;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoProduto;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoGrupoProduto;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicioVigencia;
    @XmlElement(required = true)
    protected Id id;
    protected BigDecimal indicePercentualMaximo;
    protected BigDecimal indicePercentualMinimo;

    /**
     * Gets the value of the codigoBlendagemProduto property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getCodigoBlendagemProduto() {
        return codigoBlendagemProduto;
    }

    /**
     * Sets the value of the codigoBlendagemProduto property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setCodigoBlendagemProduto(BigInteger value) {
        this.codigoBlendagemProduto = value;
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
     * Gets the value of the codigoGrupoProduto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCodigoGrupoProduto() {
        return codigoGrupoProduto;
    }

    /**
     * Sets the value of the codigoGrupoProduto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCodigoGrupoProduto(String value) {
        this.codigoGrupoProduto = value;
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
     * Gets the value of the indicePercentualMaximo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getIndicePercentualMaximo() {
        return indicePercentualMaximo;
    }

    /**
     * Sets the value of the indicePercentualMaximo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setIndicePercentualMaximo(BigDecimal value) {
        this.indicePercentualMaximo = value;
    }

    /**
     * Gets the value of the indicePercentualMinimo property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getIndicePercentualMinimo() {
        return indicePercentualMinimo;
    }

    /**
     * Sets the value of the indicePercentualMinimo property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setIndicePercentualMinimo(BigDecimal value) {
        this.indicePercentualMinimo = value;
    }

}
