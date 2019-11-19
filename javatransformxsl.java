import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamSource;

import net.sf.saxon.TransformerFactoryImpl;



		   TransformerFactory transformerFactory = TransformerFactory.newInstance();
		
		// Grab the handle of Transformer factory and cast it to TransformerFactoryImpl
        TransformerFactoryImpl tFactoryImpl = (TransformerFactoryImpl) transformerFactory;
		
        // Get the currently used processor
        net.sf.saxon.Configuration saxonConfig = tFactoryImpl.getConfiguration();

        //register saxon extention function (call java function from xsl) 
        saxonConfig.registerExtensionFunction(new URLToolGetTypUrlPubServerExtFct());
        saxonConfig.registerExtensionFunction(new URLToolGetTypUrlRegisterLinkExtFct());
        saxonConfig.registerExtensionFunction(new URLToolGetTypUrlPattentscopePublicationExtFct());
        saxonConfig.registerExtensionFunction(new URLEncoderEncodeExtFct());
        saxonConfig.registerExtensionFunction(new ResourceBundleContainsKeyExtFct());
        
        
        Transformer transformer = templates.newTransformer();
