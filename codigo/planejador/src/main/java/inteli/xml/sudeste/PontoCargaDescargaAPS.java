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
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}tipoElo"/&gt;
 *         &lt;element ref="{}codigoPonto"/&gt;
 *         &lt;element ref="{}descricao"/&gt;
 *         &lt;element ref="{}idEloCadeiaProducaoLocalizacao"/&gt;
 *         &lt;element ref="{}prioridade" minOccurs="0"/&gt;
 *         &lt;element ref="{}restricaoUtilizacaoElo" minOccurs="0"/&gt;
 *         &lt;element ref="{}submodaisPontoCargaDescarga"/&gt;
 *         &lt;element ref="{}tipoPonto"/&gt;
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
    "id",
    "tipoElo",
    "codigoPonto",
    "descricao",
    "idEloCadeiaProducaoLocalizacao",
    "prioridade",
    "restricaoUtilizacaoElo",
    "submodaisPontoCargaDescarga",
    "tipoPonto"
})
@XmlRootElement(name = "pontoCargaDescargaAPS")
public class PontoCargaDescargaAPS {

    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoElo;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String codigoPonto;
    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(required = true)
    protected BigInteger idEloCadeiaProducaoLocalizacao;
    protected BigInteger prioridade;
    protected RestricaoUtilizacaoElo restricaoUtilizacaoElo;
    @XmlElement(required = true)
    protected SubmodaisPontoCargaDescarga submodaisPontoCargaDescarga;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String tipoPonto;

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
     * Gets the value of the tipoElo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoElo() {
        return tipoElo;
    }

    /**
     * Sets the value of the tipoElo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoElo(String value) {
        this.tipoElo = value;
    }

    /**
     * Gets the value of the codigoPonto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPonto() {
        return codigoPonto;
    }

    /**
     * Sets the value of the codigoPonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPonto(String value) {
        this.codigoPonto = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the idEloCadeiaProducaoLocalizacao property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdEloCadeiaProducaoLocalizacao() {
        return idEloCadeiaProducaoLocalizacao;
    }

    /**
     * Sets the value of the idEloCadeiaProducaoLocalizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdEloCadeiaProducaoLocalizacao(BigInteger value) {
        this.idEloCadeiaProducaoLocalizacao = value;
    }

    /**
     * Gets the value of the prioridade property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrioridade() {
        return prioridade;
    }

    /**
     * Sets the value of the prioridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrioridade(BigInteger value) {
        this.prioridade = value;
    }

    /**
     * Gets the value of the restricaoUtilizacaoElo property.
     * 
     * @return
     *     possible object is
     *     {@link RestricaoUtilizacaoElo }
     *     
     */
    public RestricaoUtilizacaoElo getRestricaoUtilizacaoElo() {
        return restricaoUtilizacaoElo;
    }

    /**
     * Sets the value of the restricaoUtilizacaoElo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestricaoUtilizacaoElo }
     *     
     */
    public void setRestricaoUtilizacaoElo(RestricaoUtilizacaoElo value) {
        this.restricaoUtilizacaoElo = value;
    }

    /**
     * Gets the value of the submodaisPontoCargaDescarga property.
     * 
     * @return
     *     possible object is
     *     {@link SubmodaisPontoCargaDescarga }
     *     
     */
    public SubmodaisPontoCargaDescarga getSubmodaisPontoCargaDescarga() {
        return submodaisPontoCargaDescarga;
    }

    /**
     * Sets the value of the submodaisPontoCargaDescarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmodaisPontoCargaDescarga }
     *     
     */
    public void setSubmodaisPontoCargaDescarga(SubmodaisPontoCargaDescarga value) {
        this.submodaisPontoCargaDescarga = value;
    }

    /**
     * Gets the value of the tipoPonto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPonto() {
        return tipoPonto;
    }

    /**
     * Sets the value of the tipoPonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPonto(String value) {
        this.tipoPonto = value;
    }

}
