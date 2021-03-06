package com.dcs.semantic.projection.process;

import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;

import java.util.Map;


/**
 * Created by DCS Group on 9/1/17.
 *
 * This object holds all object required for executing annotation projection through the WebUI. The static instance
 * is so that each object is initialized only once.
 */
@Controller
public class LanguageDAO {

    // Static instance of this class
    static LanguageDAO instance;

    protected TranslationRetriever translations = new TranslationRetriever();

    // List of parsed corpora, mapped to their names
//    private Map<String, Corpus> corpora = Maps.newHashMap();

    // A TranslationRetriever for each language
//    private Map<Language, TranslationRetriever> translationRetrieverMap = Maps.newHashMap();

    // A HeuristicAligner for each language
    private Map<Language, HeuristicAligner> alignerMap = Maps.newHashMap();

    // A PipelineWrapper for each language
    private Map<Language, PipelineWrapper> languagePipelines = Maps.newHashMap();

    private Logger logger = LogManager.getLogger(LanguageDAO.class);

    /**
     * Get an instance of the LanguageDAO
      * @return instance of the LanguageDAO
     */
    public static LanguageDAO getInstance() {

        // Initialize if instance does not exist
        if (instance == null) {
            instance = new LanguageDAO();
        }
        return instance;
    }

    /**
     * Get the corpus by supplying its name
     * @param name Name of the corpus as a string
     * @return Corpus object
     */
//    public Corpus getCorpus(String name) {
//        return instance.corpora.get(name);
//    }

    /**
     * Get the HeuristicAligner for a Language. Lazy initialize.
     * @param language Language
     * @return HeuristicAligner for a Language
     */
    public HeuristicAligner getAligner(Language language){
        if (!alignerMap.containsKey(language)) {
            logger.info("INITALIZING ALIGNER FOR " + language);
            alignerMap.put(language, HeuristicAligner.getInstance(language));
        }
        return alignerMap.get(language);
    }

    /**
     * Get the TranslationRetriever for a Language
     * @param language Language
     * @return TranslationRetriever for a Language
     */
//    public TranslationRetriever getTranslationRetriever(Language language) {
//        return translationRetrieverMap.get(language);
//    }

    /**
     * Get the parsing pipeline for a Language. Lazy initialize.
     * @param language Language
     * @return parsing pipeline for a Language
     */
    public PipelineWrapper getPipeline(Language language) {
        // init pipeline if not yet done
        if (!languagePipelines.containsKey(language)) {
            logger.info("INITALIZING PIPELINE FOR " + language);
            languagePipelines.put(language, new PipelineWrapper(language));
        }
        return languagePipelines.get(language);
    }

}
