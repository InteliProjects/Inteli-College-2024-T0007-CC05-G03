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
 *         &lt;element ref="{}capacidadeProducaoDisponibilizacao"/&gt;
 *         &lt;element ref="{}dataInicioVigencia"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idEloCadeiaProducao"/&gt;
 *         &lt;element ref="{}indicadorUnidadeTempo"/&gt;
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
    "capacidadeProducaoDisponibilizacao",
    "dataInicioVigencia",
    "id",
    "idEloCadeiaProducao",
    "indicadorUnidadeTempo"
})
@XmlRootElement(name = "capacidadeProducaoDisponibilizacaoElo")
public class CapacidadeProducaoDisponibilizacaoElo {

    @XmlElement(required = true)
    protected BigDecimal capacidadeProducaoDisponibilizacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicioVigencia;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected BigInteger idEloCadeiaProducao;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String indicadorUnidadeTempo;

    /**
     * Gets the value of the capacidadeProducaoDisponibilizacao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapacidadeProducaoDisponibilizacao() {
        return capacidadeProducaoDisponibilizacao;
    }

    /**
     * Sets the value of the capacidadeProducaoDisponibilizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapacidadeProducaoDisponibilizacao(BigDecimal value) {
        this.capacidadeProducaoDisponibilizacao = value;
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
     * Gets the value of the indicadorUnidadeTempo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorUnidadeTempo() {
        return indicadorUnidadeTempo;
    }

    /**
     * Sets the value of the indicadorUnidadeTempo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorUnidadeTempo(String value) {
        this.indicadorUnidadeTempo = value;
    }

}
