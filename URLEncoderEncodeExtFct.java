package org.core;

import java.net.URLEncoder;

import net.sf.saxon.expr.XPathContext;
import net.sf.saxon.lib.ExtensionFunctionCall;
import net.sf.saxon.lib.ExtensionFunctionDefinition;
import net.sf.saxon.om.Sequence;
import net.sf.saxon.om.StructuredQName;
import net.sf.saxon.trans.XPathException;
import net.sf.saxon.value.SequenceType;
import net.sf.saxon.value.StringValue;

public class URLEncoderEncodeExtFct extends ExtensionFunctionDefinition {

	@Override
	public StructuredQName getFunctionQName() {
		return new StructuredQName("emd", "http://org.epo.mimosaserver.core.saxonextfct.URLEncoderEncodeExtFct",
				"encode");
	}

	@Override
	public net.sf.saxon.value.SequenceType getResultType(net.sf.saxon.value.SequenceType[] suppliedArgumentTypes) {
		// TODO Auto-generated method stub
		return SequenceType.SINGLE_STRING;
	}

	@Override
	public SequenceType[] getArgumentTypes() {
		return new SequenceType[] { SequenceType.SINGLE_STRING};
	}

	@Override
	public ExtensionFunctionCall makeCallExpression() {
		return new ExtensionFunctionCall() {
			@Override
			public Sequence call(XPathContext context, Sequence[] arguments) throws XPathException {
				String v0 = arguments[0].toString();

				return StringValue
						.makeStringValue( URLEncoder.encode(v0));

			}
		};
	}

}
