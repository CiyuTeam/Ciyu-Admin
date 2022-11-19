package com.company.ciyu.screen.glossary;

import io.jmix.ui.screen.*;
import com.company.ciyu.entity.Glossary;

@UiController("Glossary.browse")
@UiDescriptor("glossary-browse.xml")
@LookupComponent("table")
public class GlossaryBrowse extends MasterDetailScreen<Glossary> {
}