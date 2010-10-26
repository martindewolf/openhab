/*
* generated by Xtext
*/
package org.openhab.model.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.openhab.model.services.ItemsGrammarAccess;

public class ItemsParser extends AbstractContentAssistParser {
	
	@Inject
	private ItemsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.openhab.model.ui.contentassist.antlr.internal.InternalItemsParser createParser() {
		org.openhab.model.ui.contentassist.antlr.internal.InternalItemsParser result = new org.openhab.model.ui.contentassist.antlr.internal.InternalItemsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getItemAccess().getAlternatives_0(), "rule__Item__Alternatives_0");
					put(grammarAccess.getItemAccess().getIconAlternatives_3_1_0(), "rule__Item__IconAlternatives_3_1_0");
					put(grammarAccess.getNormalItemAccess().getTypeAlternatives_0(), "rule__NormalItem__TypeAlternatives_0");
					put(grammarAccess.getItemAccess().getGroup(), "rule__Item__Group__0");
					put(grammarAccess.getItemAccess().getGroup_3(), "rule__Item__Group_3__0");
					put(grammarAccess.getItemAccess().getGroup_4(), "rule__Item__Group_4__0");
					put(grammarAccess.getItemAccess().getGroup_4_2(), "rule__Item__Group_4_2__0");
					put(grammarAccess.getItemAccess().getGroup_5(), "rule__Item__Group_5__0");
					put(grammarAccess.getItemAccess().getGroup_5_2(), "rule__Item__Group_5_2__0");
					put(grammarAccess.getGroupItemAccess().getGroup(), "rule__GroupItem__Group__0");
					put(grammarAccess.getBindingAccess().getGroup(), "rule__Binding__Group__0");
					put(grammarAccess.getItemModelAccess().getItemsAssignment(), "rule__ItemModel__ItemsAssignment");
					put(grammarAccess.getItemAccess().getNameAssignment_1(), "rule__Item__NameAssignment_1");
					put(grammarAccess.getItemAccess().getLabelAssignment_2(), "rule__Item__LabelAssignment_2");
					put(grammarAccess.getItemAccess().getIconAssignment_3_1(), "rule__Item__IconAssignment_3_1");
					put(grammarAccess.getItemAccess().getGroupsAssignment_4_1(), "rule__Item__GroupsAssignment_4_1");
					put(grammarAccess.getItemAccess().getGroupsAssignment_4_2_1(), "rule__Item__GroupsAssignment_4_2_1");
					put(grammarAccess.getItemAccess().getBindingsAssignment_5_1(), "rule__Item__BindingsAssignment_5_1");
					put(grammarAccess.getItemAccess().getBindingsAssignment_5_2_1(), "rule__Item__BindingsAssignment_5_2_1");
					put(grammarAccess.getNormalItemAccess().getTypeAssignment(), "rule__NormalItem__TypeAssignment");
					put(grammarAccess.getBindingAccess().getTypeAssignment_0(), "rule__Binding__TypeAssignment_0");
					put(grammarAccess.getBindingAccess().getConfigurationAssignment_2(), "rule__Binding__ConfigurationAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.openhab.model.ui.contentassist.antlr.internal.InternalItemsParser typedParser = (org.openhab.model.ui.contentassist.antlr.internal.InternalItemsParser) parser;
			typedParser.entryRuleItemModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ItemsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ItemsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}