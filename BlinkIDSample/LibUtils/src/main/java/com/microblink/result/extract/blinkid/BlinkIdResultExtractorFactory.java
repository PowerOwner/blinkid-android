package com.microblink.result.extract.blinkid;

import com.microblink.entities.recognizers.blinkbarcode.usdl.UsdlRecognizer;
import com.microblink.entities.recognizers.blinkcard.BlinkCardEliteRecognizer;
import com.microblink.entities.recognizers.blinkcard.BlinkCardRecognizer;
import com.microblink.entities.recognizers.blinkid.australia.AustraliaDlBackRecognizer;
import com.microblink.entities.recognizers.blinkid.australia.AustraliaDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.austria.AustriaDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.austria.AustriaIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.austria.AustriaIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.austria.AustriaPassportRecognizer;
import com.microblink.entities.recognizers.blinkid.brunei.BruneiIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.brunei.BruneiIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.brunei.BruneiMilitaryIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.brunei.BruneiMilitaryIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.brunei.BruneiResidencePermitBackRecognizer;
import com.microblink.entities.recognizers.blinkid.brunei.BruneiResidencePermitFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.brunei.BruneiTemporaryResidencePermitBackRecognizer;
import com.microblink.entities.recognizers.blinkid.brunei.BruneiTemporaryResidencePermitFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.colombia.ColombiaDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.colombia.ColombiaIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.colombia.ColombiaIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.croatia.CroatiaCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.croatia.CroatiaIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.croatia.CroatiaIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.cyprus.CyprusIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.cyprus.CyprusIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.cyprus.CyprusOldIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.cyprus.CyprusOldIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.czechia.CzechiaCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.czechia.CzechiaIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.documentface.DocumentFaceRecognizer;
import com.microblink.entities.recognizers.blinkid.egypt.EgyptIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.eudl.EudlRecognizer;
import com.microblink.entities.recognizers.blinkid.generic.BlinkIdCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.generic.BlinkIdRecognizer;
import com.microblink.entities.recognizers.blinkid.germany.GermanyCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.germany.GermanyDlBackRecognizer;
import com.microblink.entities.recognizers.blinkid.germany.GermanyDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.germany.GermanyIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.germany.GermanyIdOldRecognizer;
import com.microblink.entities.recognizers.blinkid.germany.GermanyPassportRecognizer;
import com.microblink.entities.recognizers.blinkid.hongkong.HongKongIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.indonesia.IndonesiaIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.ireland.IrelandDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.italy.ItalyDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.jordan.JordanIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.jordan.JordanIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.kuwait.KuwaitIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.kuwait.KuwaitIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.malaysia.MalaysiaDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.malaysia.MalaysiaIkadFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.malaysia.MalaysiaMyKadBackRecognizer;
import com.microblink.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.malaysia.MalaysiaMyKasFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.malaysia.MalaysiaMyPrFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.malaysia.MalaysiaMyTenteraFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.mexico.MexicoVoterIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.morocco.MoroccoIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.mrtd.MrtdRecognizer;
import com.microblink.entities.recognizers.blinkid.newzealand.NewZealandDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.nigeria.NigeriaVoterIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.passport.PassportRecognizer;
import com.microblink.entities.recognizers.blinkid.poland.PolandCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.poland.PolandIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.poland.PolandIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.romania.RomaniaIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.singapore.SingaporeChangiEmployeeIdRecognizer;
import com.microblink.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.singapore.SingaporeDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.singapore.SingaporeIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.singapore.SingaporeIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.slovakia.SlovakiaCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.slovakia.SlovakiaIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.slovakia.SlovakiaIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.slovenia.SloveniaCombinedRecognizer;
import com.microblink.entities.recognizers.blinkid.slovenia.SloveniaIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.slovenia.SloveniaIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.spain.SpainDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.sweden.SwedenDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.switzerland.SwitzerlandDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.switzerland.SwitzerlandIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.switzerland.SwitzerlandIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.switzerland.SwitzerlandPassportRecognizer;
import com.microblink.entities.recognizers.blinkid.unitedArabEmirates.UnitedArabEmiratesDlFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.unitedArabEmirates.UnitedArabEmiratesIdBackRecognizer;
import com.microblink.entities.recognizers.blinkid.unitedArabEmirates.UnitedArabEmiratesIdFrontRecognizer;
import com.microblink.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer;
import com.microblink.result.extract.blinkcard.BlinkCardEliteRecognitionResultExtractor;
import com.microblink.result.extract.blinkcard.BlinkCardRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.australia.AustralianDLBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.australia.AustralianDLFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.austria.AustriaDlFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.austria.AustrianIDBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.austria.AustrianIDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.austria.AustrianIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.austria.AustrianPassportRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.brunei.BruneiIdBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.brunei.BruneiIdFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.brunei.BruneiMilitaryIdBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.brunei.BruneiMilitaryIdFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.brunei.BruneiResidencePermitBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.brunei.BruneiResidencePermitFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.brunei.BruneiTemporaryResidencePermitBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.brunei.BruneiTemporaryResidencePermitFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.colombia.ColombiaDlFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.colombia.ColombiaIDBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.colombia.ColombiaIDFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.croatia.CroatianIDBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.croatia.CroatianIDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.croatia.CroatianIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.cyprus.CyprusIdBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.cyprus.CyprusIdFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.cyprus.CyprusOldIdBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.cyprus.CyprusOldIdFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.czechia.CzechIDBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.czechia.CzechIDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.czechia.CzechIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.documentface.DocumentFaceRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.egypt.EgyptIDFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.eudl.EUDriversLicenceRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.generic.BlinkIDCombinedRecognizerResultExtractor;
import com.microblink.result.extract.blinkid.generic.BlinkIDRecognizerResultExtractor;
import com.microblink.result.extract.blinkid.germany.GermanDLBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.germany.GermanIDBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.germany.GermanIDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.germany.GermanIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.germany.GermanOldIDRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.germany.GermanPassportRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.germany.GermanyDlFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.hongkong.HongKongIdFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.indonesia.IndonesianIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.ireland.IrelandDlFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.italy.ItalyDlFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.jordan.JordanIDBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.jordan.JordanIDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.jordan.JordanIDFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.kuwait.KuwaitIdBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.kuwait.KuwaitIdFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.malaysia.MalaysiaDLFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.malaysia.MalaysiaIKadFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.malaysia.MalaysiaMyKadFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.malaysia.MalaysiaMyKasFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.malaysia.MalaysiaMyPrFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.malaysia.MalaysiaMyTenteraRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.malaysia.MyKadBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.mexico.MexicoVoterIdFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.morocco.MoroccoIdBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.morocco.MoroccoIdFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.mrtd.MRTDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.mrtd.MrtdRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.newzealand.NewZealandDLFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.nigeria.NigeriaVoterIdBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.passport.PassportResultExtractor;
import com.microblink.result.extract.blinkid.poland.PolishIDBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.poland.PolishIDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.poland.PolishIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.romania.RomanianIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.singapore.SingaporeChangiEmployeeIdRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.singapore.SingaporeCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.singapore.SingaporeDlFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.singapore.SingaporeIDBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.singapore.SingaporeIDFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.slovakia.SlovakIDBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.slovakia.SlovakIDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.slovakia.SlovakIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.slovenia.SlovenianIDBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.slovenia.SlovenianIDCombinedRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.slovenia.SlovenianIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.spain.SpainDlFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.sweden.SwedenDlFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.switzerland.SwissDLFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.switzerland.SwissIDBackSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.switzerland.SwissIDFrontSideRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.switzerland.SwissPassportRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.unitedArabEmirates.UnitedArabEmiratesDlFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.unitedArabEmirates.UnitedArabEmiratesIDBackRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.unitedArabEmirates.UnitedArabEmiratesIDFrontRecognitionResultExtractor;
import com.microblink.result.extract.blinkid.usdl.USDLCombinedResultExtractor;
import com.microblink.result.extract.blinkinput.BlinkInputResultExtractorFactory;
import com.microblink.result.extract.usdl.USDLResultExtractor;

public class BlinkIdResultExtractorFactory extends BlinkInputResultExtractorFactory {

    @Override
    protected void addExtractors() {
        super.addExtractors();

        add(UsdlRecognizer.class,
                new USDLResultExtractor());
        add(UsdlCombinedRecognizer.class,
                new USDLCombinedResultExtractor());
        add(AustraliaDlFrontRecognizer.class,
                new AustralianDLFrontSideRecognitionResultExtractor());
        add(AustraliaDlBackRecognizer.class,
                new AustralianDLBackSideRecognitionResultExtractor());
        add(AustriaDlFrontRecognizer.class,
                new AustriaDlFrontRecognitionResultExtractor());
        add(AustriaIdFrontRecognizer.class,
                new AustrianIDFrontSideRecognitionResultExtractor());
        add(AustriaIdBackRecognizer.class,
                new AustrianIDBackSideRecognitionResultExtractor());
        add(AustriaCombinedRecognizer.class,
                new AustrianIDCombinedRecognitionResultExtractor());
        add(AustriaPassportRecognizer.class,
                new AustrianPassportRecognitionResultExtractor());
        add(BlinkIdRecognizer.class,
                new BlinkIDRecognizerResultExtractor());
        add(BlinkIdCombinedRecognizer.class,
                new BlinkIDCombinedRecognizerResultExtractor());
        add(BruneiIdFrontRecognizer.class,
                new BruneiIdFrontRecognitionResultExtractor());
        add(BruneiIdBackRecognizer.class,
                new BruneiIdBackRecognitionResultExtractor());
        add(BruneiResidencePermitFrontRecognizer.class,
                new BruneiResidencePermitFrontRecognitionResultExtractor());
        add(BruneiResidencePermitBackRecognizer.class,
                new BruneiResidencePermitBackRecognitionResultExtractor());
        add(BruneiTemporaryResidencePermitFrontRecognizer.class,
                new BruneiTemporaryResidencePermitFrontRecognitionResultExtractor());
        add(BruneiTemporaryResidencePermitBackRecognizer.class,
                new BruneiTemporaryResidencePermitBackRecognitionResultExtractor());
        add(BruneiMilitaryIdFrontRecognizer.class,
                new BruneiMilitaryIdFrontRecognitionResultExtractor());
        add(BruneiMilitaryIdBackRecognizer.class,
                new BruneiMilitaryIdBackRecognitionResultExtractor());
        add(CroatiaIdFrontRecognizer.class,
                new CroatianIDFrontSideRecognitionResultExtractor());
        add(CroatiaIdBackRecognizer.class,
                new CroatianIDBackSideRecognitionResultExtractor());
        add(CroatiaCombinedRecognizer.class,
                new CroatianIDCombinedRecognitionResultExtractor());
        add(CyprusIdFrontRecognizer.class,
                new CyprusIdFrontRecognitionResultExtractor());
        add(CyprusIdBackRecognizer.class,
                new CyprusIdBackRecognitionResultExtractor());
        add(CyprusOldIdBackRecognizer.class,
                new CyprusOldIdBackRecognitionResultExtractor());
        add(CyprusOldIdFrontRecognizer.class,
                new CyprusOldIdFrontRecognitionResultExtractor());
        add(CzechiaIdBackRecognizer.class,
                new CzechIDBackSideRecognitionResultExtractor());
        add(CzechiaIdFrontRecognizer.class,
                new CzechIDFrontSideRecognitionResultExtractor());
        add(CzechiaCombinedRecognizer.class,
                new CzechIDCombinedRecognitionResultExtractor());
        add(GermanyIdOldRecognizer.class,
                new GermanOldIDRecognitionResultExtractor());
        add(GermanyIdBackRecognizer.class,
                new GermanIDBackSideRecognitionResultExtractor());
        add(GermanyCombinedRecognizer.class,
                new GermanIDCombinedRecognitionResultExtractor());
        add(GermanyIdFrontRecognizer.class,
                new GermanIDFrontSideRecognitionResultExtractor());
        add(GermanyPassportRecognizer.class,
                new GermanPassportRecognitionResultExtractor());
        add(GermanyDlBackRecognizer.class,
                new GermanDLBackSideRecognitionResultExtractor());
        add(GermanyDlFrontRecognizer.class,
                new GermanyDlFrontSideRecognitionResultExtractor());
        add(IndonesiaIdFrontRecognizer.class,
                new IndonesianIDFrontSideRecognitionResultExtractor());
        add(IrelandDlFrontRecognizer.class,
                new IrelandDlFrontRecognitionResultExtractor());
        add(ItalyDlFrontRecognizer.class,
                new ItalyDlFrontRecognitionResultExtractor());
        add(JordanIdFrontRecognizer.class,
                new JordanIDFrontRecognitionResultExtractor());
        add(JordanIdBackRecognizer.class,
                new JordanIDBackRecognitionResultExtractor());
        add(JordanCombinedRecognizer.class,
                new JordanIDCombinedRecognitionResultExtractor());
        add(HongKongIdFrontRecognizer.class,
                new HongKongIdFrontRecognitionResultExtractor());
        add(ColombiaDlFrontRecognizer.class,
                new ColombiaDlFrontRecognitionResultExtractor());
        add(ColombiaIdFrontRecognizer.class,
                new ColombiaIDFrontRecognitionResultExtractor());
        add(ColombiaIdBackRecognizer.class,
                new ColombiaIDBackRecognitionResultExtractor());
        add(EgyptIdFrontRecognizer.class,
                new EgyptIDFrontRecognitionResultExtractor());
        add(MalaysiaDlFrontRecognizer.class,
                new MalaysiaDLFrontRecognitionResultExtractor());
        add(NewZealandDlFrontRecognizer.class,
                new NewZealandDLFrontSideRecognitionResultExtractor());
        add(SwitzerlandIdBackRecognizer.class,
                new SwissIDBackSideRecognitionResultExtractor());
        add(SwitzerlandPassportRecognizer.class,
                new SwissPassportRecognitionResultExtractor());
        add(SwitzerlandIdFrontRecognizer.class,
                new SwissIDFrontSideRecognitionResultExtractor());
        add(SwitzerlandDlFrontRecognizer.class,
                new SwissDLFrontSideRecognitionResultExtractor());
        add(EudlRecognizer.class,
                new EUDriversLicenceRecognitionResultExtractor());
        add(DocumentFaceRecognizer.class,
                new DocumentFaceRecognitionResultExtractor());
        add(MalaysiaMyKadFrontRecognizer.class,
                new MalaysiaMyKadFrontRecognitionResultExtractor());
        add(MalaysiaMyKadBackRecognizer.class,
                new MyKadBackRecognitionResultExtractor());
        add(MalaysiaMyTenteraFrontRecognizer.class,
                new MalaysiaMyTenteraRecognitionResultExtractor());
        add(MalaysiaMyPrFrontRecognizer.class,
                new MalaysiaMyPrFrontRecognitionResultExtractor());
        add(MalaysiaMyKasFrontRecognizer.class,
                new MalaysiaMyKasFrontRecognitionResultExtractor());
        add(MalaysiaIkadFrontRecognizer.class,
                new MalaysiaIKadFrontRecognitionResultExtractor());
        add(MexicoVoterIdFrontRecognizer.class,
                new MexicoVoterIdFrontRecognitionResultExtractor());
        add(MoroccoIdBackRecognizer.class,
                new MoroccoIdBackRecognitionResultExtractor());
        add(MoroccoIdFrontRecognizer.class,
                new MoroccoIdFrontRecognitionResultExtractor());
        add(BlinkCardRecognizer.class,
                new BlinkCardRecognitionResultExtractor());
        add(BlinkCardEliteRecognizer.class,
                new BlinkCardEliteRecognitionResultExtractor());
        add(NigeriaVoterIdBackRecognizer.class,
                new NigeriaVoterIdBackRecognitionResultExtractor());
        add(PassportRecognizer.class,
                new PassportResultExtractor());
        add(PolandIdBackRecognizer.class,
                new PolishIDBackSideRecognitionResultExtractor());
        add(PolandIdFrontRecognizer.class,
                new PolishIDFrontSideRecognitionResultExtractor());
        add(PolandCombinedRecognizer.class,
                new PolishIDCombinedRecognitionResultExtractor());
        add(SlovakiaIdBackRecognizer.class,
                new SlovakIDBackSideRecognitionResultExtractor());
        add(SlovakiaIdFrontRecognizer.class,
                new SlovakIDFrontSideRecognitionResultExtractor());
        add(SlovakiaCombinedRecognizer.class,
                new SlovakIDCombinedRecognitionResultExtractor());
        add(SloveniaIdFrontRecognizer.class,
                new SlovenianIDFrontSideRecognitionResultExtractor());
        add(SloveniaIdBackRecognizer.class,
                new SlovenianIDBackSideRecognitionResultExtractor());
        add(SloveniaCombinedRecognizer.class,
                new SlovenianIDCombinedRecognitionResultExtractor());
        add(SingaporeIdBackRecognizer.class,
                new SingaporeIDBackRecognitionResultExtractor());
        add(SingaporeIdFrontRecognizer.class,
                new SingaporeIDFrontRecognitionResultExtractor());
        add(SingaporeCombinedRecognizer.class,
                new SingaporeCombinedRecognitionResultExtractor());
        add(SingaporeDlFrontRecognizer.class,
                new SingaporeDlFrontRecognitionResultExtractor());
        add(SingaporeChangiEmployeeIdRecognizer.class,
                new SingaporeChangiEmployeeIdRecognitionResultExtractor());
        add(SpainDlFrontRecognizer.class,
                new SpainDlFrontRecognitionResultExtractor());
        add(RomaniaIdFrontRecognizer.class,
                new RomanianIDFrontSideRecognitionResultExtractor());
        add(UnitedArabEmiratesIdFrontRecognizer.class,
                new UnitedArabEmiratesIDFrontRecognitionResultExtractor());
        add(UnitedArabEmiratesIdBackRecognizer.class,
                new UnitedArabEmiratesIDBackRecognitionResultExtractor());
        add(UnitedArabEmiratesDlFrontRecognizer.class,
                new UnitedArabEmiratesDlFrontRecognitionResultExtractor());
        add(MrtdCombinedRecognizer.class,
                new MRTDCombinedRecognitionResultExtractor());
        add(MrtdRecognizer.class,
                new MrtdRecognitionResultExtractor());
        add(SwedenDlFrontRecognizer.class,
                new SwedenDlFrontRecognitionResultExtractor());
        add(KuwaitIdFrontRecognizer.class,
                new KuwaitIdFrontRecognitionResultExtractor());
        add(KuwaitIdBackRecognizer.class,
                new KuwaitIdBackRecognitionResultExtractor());
    }
}
