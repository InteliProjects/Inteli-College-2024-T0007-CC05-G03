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
 *         &lt;element ref="{}capacidadeProducaoDiponibilizacao"/&gt;
 *         &lt;element ref="{}codigoProduto"/&gt;
 *         &lt;element ref="{}data"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}idEloCadeiaProducao"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element ref="{}idEloEntrega"/&gt;
 *           &lt;element ref="{}idSistemaProducao"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{}minimina"/&gt;
 *         &lt;element ref="{}qtdeMinimaMandatoria" minOccurs="0"/&gt;
 *         &lt;element ref="{}tipoAssociacao"/&gt;
 *         &lt;element ref="{}tipoVisaoPrazo"/&gt;
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
    "capacidadeProducaoDiponibilizacao",
    "codigoProduto",
    "data",
    "id",
    "idEloCadeiaProducao",
    "idEloEntrega",
    "idSistemaProducao",
    "minimina",
    "qtdeMinimaMandatoria",
    "tipoAssociacao",
    "tipoVisaoPrazo"
})
@XmlRootElement(name = "capacidadeProducaoDisponibilizacaoProdutoElo")
public class CapacidadeProducaoDisponibilizacaoProdutoElo {

    @XmlElement(required = true)
    protected BigDecimal capacidadeProducaoDiponibilizacao;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String codigoProduto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected BigInteger idEloCadeiaProducao;
    protected BigInteger idEloEntrega;
    protected BigInteger idSistemaProducao;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String minimina;
    protected BigDecimal qtdeMinimaMandatoria;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoAssociacao;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoVisaoPrazo;

    /**
     * Gets the value of the capacidadeProducaoDiponibilizacao property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getCapacidadeProducaoDiponibilizacao() {
        return capacidadeProducaoDiponibilizacao;
    }

    /**
     * Sets the value of the capacidadeProducaoDiponibilizacao property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setCapacidadeProducaoDiponibilizacao(BigDecimal value) {
        this.capacidadeProducaoDiponibilizacao = value;
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
     * Gets the value of the data property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
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
     * Gets the value of the idEloEntrega property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdEloEntrega() {
        return idEloEntrega;
    }

    /**
     * Sets the value of the idEloEntrega property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdEloEntrega(BigInteger value) {
        this.idEloEntrega = value;
    }

    /**
     * Gets the value of the idSistemaProducao property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getIdSistemaProducao() {
        return idSistemaProducao;
    }

    /**
     * Sets the value of the idSistemaProducao property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setIdSistemaProducao(BigInteger value) {
        this.idSistemaProducao = value;
    }

    /**
     * Gets the value of the minimina property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMinimina() {
        return minimina;
    }

    /**
     * Sets the value of the minimina property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMinimina(String value) {
        this.minimina = value;
    }

    /**
     * Gets the value of the qtdeMinimaMandatoria property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getQtdeMinimaMandatoria() {
        return qtdeMinimaMandatoria;
    }

    /**
     * Sets the value of the qtdeMinimaMandatoria property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setQtdeMinimaMandatoria(BigDecimal value) {
        this.qtdeMinimaMandatoria = value;
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
     * Gets the value of the tipoVisaoPrazo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoVisaoPrazo() {
        return tipoVisaoPrazo;
    }

    /**
     * Sets the value of the tipoVisaoPrazo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoVisaoPrazo(String value) {
        this.tipoVisaoPrazo = value;
    }

}
