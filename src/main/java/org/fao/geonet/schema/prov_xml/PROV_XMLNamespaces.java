package org.fao.geonet.schema.prov_xml;

import org.jdom.Namespace;

/**
 * Namespaces for prov-xml metadata standard.
 */
public class PROV_XMLNamespaces {
    public static final Namespace PROV =
            Namespace.getNamespace("prov", "http://www.w3.org/ns/prov#");
    public static final Namespace DC   =
            Namespace.getNamespace("dc", "http://purl.org/dc/elements/1.1/");
    public static final Namespace DCT  =
            Namespace.getNamespace("dct", "http://purl.org/dc/terms/");
    public static final Namespace XSD =
            Namespace.getNamespace("xsd", "http://www.w3.org/2001/XMLSchema");
}
