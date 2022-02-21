//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.02.21 a las 10:31:20 AM CST 
//


package com.baeldung.springsoap.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pokemon complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pokemon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="base_experience" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location_area_encounters" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;sequence>
 *           &lt;element name="abilities" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="ability" type="{http://www.baeldung.com/springsoap/gen}ability"/>
 *                     &lt;element name="is_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="held_items" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{http://www.baeldung.com/springsoap/gen}item"/>
 *                     &lt;sequence>
 *                       &lt;element name="version_details" maxOccurs="unbounded" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="version" type="{http://www.baeldung.com/springsoap/gen}version"/>
 *                                 &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                               &lt;/sequence>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pokemon", propOrder = {
    "baseExperience",
    "id",
    "name",
    "locationAreaEncounters",
    "height",
    "abilities",
    "heldItems"
})
public class Pokemon {

    @XmlElement(name = "base_experience")
    protected int baseExperience;
    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "location_area_encounters", required = true)
    protected String locationAreaEncounters;
    protected int height;
    protected List<Pokemon.Abilities> abilities;
    @XmlElement(name = "held_items")
    protected List<Pokemon.HeldItems> heldItems;

    /**
     * Obtiene el valor de la propiedad baseExperience.
     * 
     */
    public int getBaseExperience() {
        return baseExperience;
    }

    /**
     * Define el valor de la propiedad baseExperience.
     * 
     */
    public void setBaseExperience(int value) {
        this.baseExperience = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad locationAreaEncounters.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * Define el valor de la propiedad locationAreaEncounters.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAreaEncounters(String value) {
        this.locationAreaEncounters = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }

    /**
     * Gets the value of the abilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pokemon.Abilities }
     * 
     * 
     */
    public List<Pokemon.Abilities> getAbilities() {
        if (abilities == null) {
            abilities = new ArrayList<Pokemon.Abilities>();
        }
        return this.abilities;
    }

    /**
     * Gets the value of the heldItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heldItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeldItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pokemon.HeldItems }
     * 
     * 
     */
    public List<Pokemon.HeldItems> getHeldItems() {
        if (heldItems == null) {
            heldItems = new ArrayList<Pokemon.HeldItems>();
        }
        return this.heldItems;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ability" type="{http://www.baeldung.com/springsoap/gen}ability"/>
     *         &lt;element name="is_hidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ability",
        "isHidden",
        "slot"
    })
    public static class Abilities {

        @XmlElement(required = true)
        protected Ability ability;
        @XmlElement(name = "is_hidden")
        protected boolean isHidden;
        protected int slot;

        /**
         * Obtiene el valor de la propiedad ability.
         * 
         * @return
         *     possible object is
         *     {@link Ability }
         *     
         */
        public Ability getAbility() {
            return ability;
        }

        /**
         * Define el valor de la propiedad ability.
         * 
         * @param value
         *     allowed object is
         *     {@link Ability }
         *     
         */
        public void setAbility(Ability value) {
            this.ability = value;
        }

        /**
         * Obtiene el valor de la propiedad isHidden.
         * 
         */
        public boolean isIsHidden() {
            return isHidden;
        }

        /**
         * Define el valor de la propiedad isHidden.
         * 
         */
        public void setIsHidden(boolean value) {
            this.isHidden = value;
        }

        /**
         * Obtiene el valor de la propiedad slot.
         * 
         */
        public int getSlot() {
            return slot;
        }

        /**
         * Define el valor de la propiedad slot.
         * 
         */
        public void setSlot(int value) {
            this.slot = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" type="{http://www.baeldung.com/springsoap/gen}item"/>
     *         &lt;sequence>
     *           &lt;element name="version_details" maxOccurs="unbounded" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="version" type="{http://www.baeldung.com/springsoap/gen}version"/>
     *                     &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item",
        "versionDetails"
    })
    public static class HeldItems {

        @XmlElement(required = true)
        protected Item item;
        @XmlElement(name = "version_details")
        protected List<Pokemon.HeldItems.VersionDetails> versionDetails;

        /**
         * Obtiene el valor de la propiedad item.
         * 
         * @return
         *     possible object is
         *     {@link Item }
         *     
         */
        public Item getItem() {
            return item;
        }

        /**
         * Define el valor de la propiedad item.
         * 
         * @param value
         *     allowed object is
         *     {@link Item }
         *     
         */
        public void setItem(Item value) {
            this.item = value;
        }

        /**
         * Gets the value of the versionDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the versionDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVersionDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Pokemon.HeldItems.VersionDetails }
         * 
         * 
         */
        public List<Pokemon.HeldItems.VersionDetails> getVersionDetails() {
            if (versionDetails == null) {
                versionDetails = new ArrayList<Pokemon.HeldItems.VersionDetails>();
            }
            return this.versionDetails;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="version" type="{http://www.baeldung.com/springsoap/gen}version"/>
         *         &lt;element name="rarity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "version",
            "rarity"
        })
        public static class VersionDetails {

            @XmlElement(required = true)
            protected Version version;
            protected int rarity;

            /**
             * Obtiene el valor de la propiedad version.
             * 
             * @return
             *     possible object is
             *     {@link Version }
             *     
             */
            public Version getVersion() {
                return version;
            }

            /**
             * Define el valor de la propiedad version.
             * 
             * @param value
             *     allowed object is
             *     {@link Version }
             *     
             */
            public void setVersion(Version value) {
                this.version = value;
            }

            /**
             * Obtiene el valor de la propiedad rarity.
             * 
             */
            public int getRarity() {
                return rarity;
            }

            /**
             * Define el valor de la propiedad rarity.
             * 
             */
            public void setRarity(int value) {
                this.rarity = value;
            }

        }

    }

}
