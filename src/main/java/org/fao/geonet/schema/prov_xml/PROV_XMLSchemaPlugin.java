package org.fao.geonet.schema.prov_xml;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import org.fao.geonet.kernel.schema.AssociatedResource;
import org.fao.geonet.kernel.schema.AssociatedResourcesSchemaPlugin;
import org.fao.geonet.kernel.schema.ISOPlugin;
import org.fao.geonet.kernel.schema.MultilingualSchemaPlugin;
import org.fao.geonet.utils.Log;
import org.fao.geonet.utils.Xml;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.filter.ElementFilter;
import org.jdom.xpath.XPath;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by francois on 6/15/14. Modification for prov-xml by sppigot.
 */
public class PROV_XMLSchemaPlugin
        extends org.fao.geonet.kernel.schema.SchemaPlugin
        implements
                AssociatedResourcesSchemaPlugin,
                MultilingualSchemaPlugin,
                ISOPlugin {
    public static final String IDENTIFIER = "prov-xml";

    private static ImmutableSet<Namespace> allNamespaces;
    private static Map<String, Namespace> allTypenames;
    static {
        allNamespaces = ImmutableSet.<Namespace>builder()
                .add(PROV_XMLNamespaces.PROV)
                .add(PROV_XMLNamespaces.DC)
                .add(PROV_XMLNamespaces.DCT)
                .add(PROV_XMLNamespaces.XSD)
                .build();
        allTypenames = ImmutableMap.<String, Namespace>builder()
                .put("csw:Record", Namespace.getNamespace("csw", "http://www.opengis.net/cat/csw/2.0.2"))
                .put("prov:document", PROV_XMLNamespaces.PROV)
                .build();
    }

    public PROV_XMLSchemaPlugin() {
        super(IDENTIFIER);
    }

    /**
     * Return sibling relation.
     *
     * @param metadata
     * @return
     */
    public Set<AssociatedResource> getAssociatedResourcesUUIDs(Element metadata) {
				return new HashSet<AssociatedResource>();
    }

    private Element getChild(Element el, String name, Namespace namespace) {
        final Element child = el.getChild(name, namespace);
        if (child == null) {
            return new Element(name, namespace);
        }
        return child;
    }

    @Override
    public Set<String> getAssociatedParentUUIDs(Element metadata) {
				return new HashSet<String>();
    }

    public Set<String> getAssociatedDatasetUUIDs(Element metadata) {
				return new HashSet<String>();
    }

    public Set<String> getAssociatedFeatureCatalogueUUIDs(Element metadata) {
				return new HashSet<String>();
    }

    public Set<String> getAssociatedSourceUUIDs(Element metadata) {
				return new HashSet<String>();
    }

    private Set<String> getAttributeUuidrefValues(Element metadata, String tagName, Namespace namespace) {
				return new HashSet<String>();
    }

    @Override
    public List<Element> getTranslationForElement(Element element, String languageIdentifier) {
        return new ArrayList<Element>();
    }

    @Override
    public void addTranslationToElement(Element element, String languageIdentifier, String value) {
    }

    @Override
    public String getBasicTypeCharacterStringName() {
				return "";
    }

    @Override
    public Element createBasicTypeCharacterString() {
				return null;
    }

    @Override
    public Map<String, Namespace> getCswTypeNames() {
        return allTypenames;
    }
}
