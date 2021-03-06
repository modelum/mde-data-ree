// $ANTLR 3.2 Sep 23, 2009 12:02:23 DDL.g 2011-08-28 18:52:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DDLLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int ID=5;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int ML_COMMENT=12;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int COMPARATOR=8;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__59=59;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=6;
    public static final int OL_COMMENT=13;
    public static final int LOG_CONJ=4;
    public static final int SQUOTE=10;
    public static final int CVALUE=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int NON_SECOND_DATETIME_FIELD=9;
    public static final int WS=11;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public DDLLexer() {;} 
    public DDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "DDL.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:3:7: ( 'CREATE' )
            // DDL.g:3:9: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:4:7: ( 'REPLACE' )
            // DDL.g:4:9: 'REPLACE'
            {
            match("REPLACE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:5:7: ( 'TABLE' )
            // DDL.g:5:9: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:6:7: ( '(' )
            // DDL.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:7:7: ( ',' )
            // DDL.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:8:7: ( ')' )
            // DDL.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:9:7: ( 'LOGGING' )
            // DDL.g:9:9: 'LOGGING'
            {
            match("LOGGING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:10:7: ( 'NOCOMPRESS' )
            // DDL.g:10:9: 'NOCOMPRESS'
            {
            match("NOCOMPRESS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:11:7: ( 'NOCACHE' )
            // DDL.g:11:9: 'NOCACHE'
            {
            match("NOCACHE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:12:7: ( 'NOPARALLEL' )
            // DDL.g:12:9: 'NOPARALLEL'
            {
            match("NOPARALLEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:13:7: ( 'MONITORING' )
            // DDL.g:13:9: 'MONITORING'
            {
            match("MONITORING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:14:7: ( ';' )
            // DDL.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:15:7: ( 'CONSTRAINT' )
            // DDL.g:15:9: 'CONSTRAINT'
            {
            match("CONSTRAINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:16:7: ( 'NULL' )
            // DDL.g:16:9: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:17:7: ( 'NOT NULL' )
            // DDL.g:17:9: 'NOT NULL'
            {
            match("NOT NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:18:7: ( 'DEFAULT' )
            // DDL.g:18:9: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:19:7: ( 'ALTER TABLE' )
            // DDL.g:19:9: 'ALTER TABLE'
            {
            match("ALTER TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:20:7: ( 'ADD CONSTRAINT' )
            // DDL.g:20:9: 'ADD CONSTRAINT'
            {
            match("ADD CONSTRAINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:21:7: ( 'FOREIGN KEY' )
            // DDL.g:21:9: 'FOREIGN KEY'
            {
            match("FOREIGN KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:22:7: ( 'REFERENCES' )
            // DDL.g:22:9: 'REFERENCES'
            {
            match("REFERENCES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:23:7: ( '\\.' )
            // DDL.g:23:9: '\\.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:24:7: ( 'ON' )
            // DDL.g:24:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:25:7: ( 'DELETE' )
            // DDL.g:25:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:26:7: ( 'UPDATE' )
            // DDL.g:26:9: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:27:7: ( 'CASCADE' )
            // DDL.g:27:9: 'CASCADE'
            {
            match("CASCADE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:28:7: ( 'DISABLE' )
            // DDL.g:28:9: 'DISABLE'
            {
            match("DISABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:29:7: ( 'RESTRICT' )
            // DDL.g:29:9: 'RESTRICT'
            {
            match("RESTRICT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:30:7: ( 'NO ACTION' )
            // DDL.g:30:9: 'NO ACTION'
            {
            match("NO ACTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:31:7: ( 'SET NULL' )
            // DDL.g:31:9: 'SET NULL'
            {
            match("SET NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:32:7: ( 'CHECK' )
            // DDL.g:32:9: 'CHECK'
            {
            match("CHECK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:33:7: ( 'PRIMARY KEY' )
            // DDL.g:33:9: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:34:7: ( 'UNIQUE' )
            // DDL.g:34:9: 'UNIQUE'
            {
            match("UNIQUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:35:7: ( 'DATABASE' )
            // DDL.g:35:9: 'DATABASE'
            {
            match("DATABASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:36:7: ( 'SCHEMA' )
            // DDL.g:36:9: 'SCHEMA'
            {
            match("SCHEMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:37:7: ( 'IF NOT EXISTS' )
            // DDL.g:37:9: 'IF NOT EXISTS'
            {
            match("IF NOT EXISTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:38:7: ( 'CHARACTER' )
            // DDL.g:38:9: 'CHARACTER'
            {
            match("CHARACTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:39:7: ( 'SET' )
            // DDL.g:39:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:40:7: ( 'COLLATE' )
            // DDL.g:40:9: 'COLLATE'
            {
            match("COLLATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:41:7: ( 'IN' )
            // DDL.g:41:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:42:7: ( 'CHAR' )
            // DDL.g:42:9: 'CHAR'
            {
            match("CHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:43:7: ( 'CHARACTER VARYING' )
            // DDL.g:43:9: 'CHARACTER VARYING'
            {
            match("CHARACTER VARYING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:44:7: ( 'CHAR VARYING' )
            // DDL.g:44:9: 'CHAR VARYING'
            {
            match("CHAR VARYING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:45:7: ( 'VARCHAR' )
            // DDL.g:45:9: 'VARCHAR'
            {
            match("VARCHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:46:7: ( 'NATIONAL CHARACTER' )
            // DDL.g:46:9: 'NATIONAL CHARACTER'
            {
            match("NATIONAL CHARACTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:47:7: ( 'NATIONAL CHAR' )
            // DDL.g:47:9: 'NATIONAL CHAR'
            {
            match("NATIONAL CHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:48:7: ( 'NCHAR' )
            // DDL.g:48:9: 'NCHAR'
            {
            match("NCHAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:49:7: ( 'NATIONAL CHARACTER VARYING' )
            // DDL.g:49:9: 'NATIONAL CHARACTER VARYING'
            {
            match("NATIONAL CHARACTER VARYING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:50:7: ( 'NATIONAL CHAR VARYING' )
            // DDL.g:50:9: 'NATIONAL CHAR VARYING'
            {
            match("NATIONAL CHAR VARYING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:51:7: ( 'NCHAR VARYING' )
            // DDL.g:51:9: 'NCHAR VARYING'
            {
            match("NCHAR VARYING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:52:7: ( 'BIT' )
            // DDL.g:52:9: 'BIT'
            {
            match("BIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:53:7: ( 'BIT VARYING' )
            // DDL.g:53:9: 'BIT VARYING'
            {
            match("BIT VARYING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:54:7: ( 'NUMERIC' )
            // DDL.g:54:9: 'NUMERIC'
            {
            match("NUMERIC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:55:7: ( 'DECIMAL' )
            // DDL.g:55:9: 'DECIMAL'
            {
            match("DECIMAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:56:7: ( 'DEC' )
            // DDL.g:56:9: 'DEC'
            {
            match("DEC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:57:7: ( 'INTEGER' )
            // DDL.g:57:9: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:58:7: ( 'INT' )
            // DDL.g:58:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:59:7: ( 'SMALLINT' )
            // DDL.g:59:9: 'SMALLINT'
            {
            match("SMALLINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:60:7: ( 'FLOAT' )
            // DDL.g:60:9: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:61:7: ( 'REAL' )
            // DDL.g:61:9: 'REAL'
            {
            match("REAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:62:7: ( 'DOUBLE PRECISION' )
            // DDL.g:62:9: 'DOUBLE PRECISION'
            {
            match("DOUBLE PRECISION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:63:7: ( 'DATE' )
            // DDL.g:63:9: 'DATE'
            {
            match("DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:64:7: ( 'TIME' )
            // DDL.g:64:9: 'TIME'
            {
            match("TIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:65:7: ( 'WITH TIME ZONE' )
            // DDL.g:65:9: 'WITH TIME ZONE'
            {
            match("WITH TIME ZONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:66:7: ( 'TIMESTAMP' )
            // DDL.g:66:9: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:67:7: ( 'INTERVAL' )
            // DDL.g:67:9: 'INTERVAL'
            {
            match("INTERVAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:68:7: ( 'TO' )
            // DDL.g:68:9: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:69:7: ( 'SECOND' )
            // DDL.g:69:9: 'SECOND'
            {
            match("SECOND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "NON_SECOND_DATETIME_FIELD"
    public final void mNON_SECOND_DATETIME_FIELD() throws RecognitionException {
        try {
            int _type = NON_SECOND_DATETIME_FIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2186:2: ( 'YEAR' | 'MONTH' | 'DAY' | 'HOUR' | 'MINUTE' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 'Y':
                {
                alt1=1;
                }
                break;
            case 'M':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='O') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='I') ) {
                    alt1=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'D':
                {
                alt1=3;
                }
                break;
            case 'H':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // DDL.g:2186:4: 'YEAR'
                    {
                    match("YEAR"); 


                    }
                    break;
                case 2 :
                    // DDL.g:2186:13: 'MONTH'
                    {
                    match("MONTH"); 


                    }
                    break;
                case 3 :
                    // DDL.g:2186:23: 'DAY'
                    {
                    match("DAY"); 


                    }
                    break;
                case 4 :
                    // DDL.g:2186:31: 'HOUR'
                    {
                    match("HOUR"); 


                    }
                    break;
                case 5 :
                    // DDL.g:2186:40: 'MINUTE'
                    {
                    match("MINUTE"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NON_SECOND_DATETIME_FIELD"

    // $ANTLR start "SQUOTE"
    public final void mSQUOTE() throws RecognitionException {
        try {
            int _type = SQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2190:12: ( '\\u0027' )
            // DDL.g:2190:14: '\\u0027'
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUOTE"

    // $ANTLR start "CVALUE"
    public final void mCVALUE() throws RecognitionException {
        try {
            int _type = CVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2191:12: ( SQUOTE ( options {greedy=false; } : . )* SQUOTE )
            // DDL.g:2191:14: SQUOTE ( options {greedy=false; } : . )* SQUOTE
            {
            mSQUOTE(); 
            // DDL.g:2191:21: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // DDL.g:2191:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mSQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CVALUE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2192:12: ( ( '0' .. '9' | '.' )* )
            // DDL.g:2192:14: ( '0' .. '9' | '.' )*
            {
            // DDL.g:2192:14: ( '0' .. '9' | '.' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='.'||(LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "COMPARATOR"
    public final void mCOMPARATOR() throws RecognitionException {
        try {
            int _type = COMPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2193:15: ( '<>' | '>=' | '<=' | '=' | '>' | '<' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt4=1;
                    }
                    break;
                case '=':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    alt4=6;}

                }
                break;
            case '>':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='=') ) {
                    alt4=2;
                }
                else {
                    alt4=5;}
                }
                break;
            case '=':
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // DDL.g:2193:18: '<>'
                    {
                    match("<>"); 


                    }
                    break;
                case 2 :
                    // DDL.g:2193:25: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 3 :
                    // DDL.g:2193:32: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // DDL.g:2193:39: '='
                    {
                    match('='); 

                    }
                    break;
                case 5 :
                    // DDL.g:2193:45: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // DDL.g:2193:51: '<'
                    {
                    match('<'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPARATOR"

    // $ANTLR start "LOG_CONJ"
    public final void mLOG_CONJ() throws RecognitionException {
        try {
            int _type = LOG_CONJ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2194:13: ( 'OR' | 'AND' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='O') ) {
                alt5=1;
            }
            else if ( (LA5_0=='A') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // DDL.g:2194:15: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 2 :
                    // DDL.g:2194:22: 'AND'
                    {
                    match("AND"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOG_CONJ"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2195:10: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )* )
            // DDL.g:2195:12: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // DDL.g:2195:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='#' && LA6_0<='$')||LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2196:10: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // DDL.g:2196:12: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // DDL.g:2196:12: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2197:11: ( '/*' ( options {greedy=false; } : . )* '*/' ( ';' )? )
            // DDL.g:2198:2: '/*' ( options {greedy=false; } : . )* '*/' ( ';' )?
            {
            match("/*"); 

            // DDL.g:2198:7: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // DDL.g:2198:34: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 

            // DDL.g:2198:43: ( ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==';') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // DDL.g:2198:44: ';'
                    {
                    match(';'); 

                    }
                    break;

            }

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "OL_COMMENT"
    public final void mOL_COMMENT() throws RecognitionException {
        try {
            int _type = OL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:2201:11: ( '--' ( options {greedy=false; } : . )* ( '\\n' )+ )
            // DDL.g:2201:13: '--' ( options {greedy=false; } : . )* ( '\\n' )+
            {
            match("--"); 

            // DDL.g:2201:18: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n') ) {
                    alt10=2;
                }
                else if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // DDL.g:2201:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // DDL.g:2201:51: ( '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\n') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // DDL.g:2201:51: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

             _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OL_COMMENT"

    public void mTokens() throws RecognitionException {
        // DDL.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | NON_SECOND_DATETIME_FIELD | SQUOTE | CVALUE | NUMBER | COMPARATOR | LOG_CONJ | ID | WS | ML_COMMENT | OL_COMMENT )
        int alt12=77;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // DDL.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // DDL.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // DDL.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // DDL.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // DDL.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // DDL.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // DDL.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // DDL.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // DDL.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // DDL.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // DDL.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // DDL.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // DDL.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // DDL.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // DDL.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // DDL.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // DDL.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // DDL.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // DDL.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // DDL.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // DDL.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // DDL.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // DDL.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // DDL.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // DDL.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // DDL.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // DDL.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // DDL.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // DDL.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // DDL.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // DDL.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // DDL.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // DDL.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // DDL.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // DDL.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // DDL.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // DDL.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // DDL.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // DDL.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // DDL.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // DDL.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // DDL.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // DDL.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // DDL.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // DDL.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // DDL.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // DDL.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // DDL.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // DDL.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // DDL.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // DDL.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // DDL.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // DDL.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // DDL.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // DDL.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // DDL.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // DDL.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // DDL.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // DDL.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // DDL.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // DDL.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // DDL.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // DDL.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // DDL.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // DDL.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // DDL.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // DDL.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // DDL.g:1:412: NON_SECOND_DATETIME_FIELD
                {
                mNON_SECOND_DATETIME_FIELD(); 

                }
                break;
            case 69 :
                // DDL.g:1:438: SQUOTE
                {
                mSQUOTE(); 

                }
                break;
            case 70 :
                // DDL.g:1:445: CVALUE
                {
                mCVALUE(); 

                }
                break;
            case 71 :
                // DDL.g:1:452: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 72 :
                // DDL.g:1:459: COMPARATOR
                {
                mCOMPARATOR(); 

                }
                break;
            case 73 :
                // DDL.g:1:470: LOG_CONJ
                {
                mLOG_CONJ(); 

                }
                break;
            case 74 :
                // DDL.g:1:479: ID
                {
                mID(); 

                }
                break;
            case 75 :
                // DDL.g:1:482: WS
                {
                mWS(); 

                }
                break;
            case 76 :
                // DDL.g:1:485: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 77 :
                // DDL.g:1:496: OL_COMMENT
                {
                mOL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\32\3\34\3\uffff\3\34\1\uffff\3\34\1\70\12\34\1\110\6\uffff\7"+
        "\34\1\126\20\34\1\uffff\1\156\1\157\7\34\1\171\5\34\2\uffff\14\34"+
        "\1\uffff\4\34\1\uffff\10\34\1\u009a\2\34\1\u009e\3\34\1\157\2\34"+
        "\2\uffff\2\34\1\u00a7\4\34\1\uffff\1\u00ad\1\uffff\1\34\1\u00b0"+
        "\10\34\1\u00bb\3\34\1\u00bf\1\34\1\u00c2\4\34\1\uffff\1\u00c7\11"+
        "\34\1\uffff\2\34\1\u00d3\1\uffff\2\34\1\uffff\4\34\2\uffff\5\34"+
        "\1\uffff\1\34\2\uffff\1\34\2\u009e\4\34\1\u00e6\1\34\2\uffff\3\34"+
        "\1\uffff\1\u00eb\1\34\1\uffff\4\34\1\uffff\2\34\1\u00f4\1\34\1\u009e"+
        "\6\34\1\uffff\3\34\1\u00ff\11\34\1\uffff\1\u0109\3\34\1\uffff\4"+
        "\34\1\uffff\7\34\2\uffff\1\34\1\u009e\1\34\1\u011a\4\34\1\uffff"+
        "\1\34\1\uffff\1\u0120\1\u0121\1\u0122\1\u0123\5\34\1\uffff\1\34"+
        "\1\u012a\1\u012b\1\34\1\u012d\3\34\1\u0131\1\34\1\u0133\1\34\1\u0135"+
        "\2\34\1\u0138\1\uffff\1\u0139\1\u013a\1\34\1\uffff\1\34\4\uffff"+
        "\2\34\1\u013f\1\34\1\u0141\1\34\2\uffff\1\34\1\uffff\1\34\1\u0145"+
        "\1\34\1\uffff\1\34\1\uffff\1\34\1\uffff\2\34\3\uffff\1\u014b\1\uffff"+
        "\1\u014c\2\uffff\1\u014d\1\uffff\1\34\1\u0150\1\34\1\uffff\1\u0152"+
        "\2\34\1\uffff\1\34\3\uffff\1\u0157\2\uffff\1\u0158\1\uffff\1\u0159"+
        "\1\u015a\1\uffff\1\u015c\7\uffff\1\u0161\6\uffff\1\u0167\2\uffff";
    static final String DFA12_eofS =
        "\u0168\uffff";
    static final String DFA12_minS =
        "\1\11\1\101\1\105\1\101\3\uffff\1\117\1\101\1\111\1\uffff\1\101"+
        "\1\104\1\114\1\56\2\116\1\103\1\122\1\106\1\101\2\111\1\105\1\117"+
        "\1\0\6\uffff\1\105\1\114\1\123\2\101\1\102\1\115\1\43\1\107\1\40"+
        "\1\114\1\124\1\110\2\116\1\103\1\123\1\124\1\125\1\124\2\104\1\122"+
        "\1\117\1\uffff\2\43\1\104\1\111\1\103\1\110\1\101\1\111\1\40\1\43"+
        "\1\122\2\124\1\101\1\125\2\uffff\1\101\1\123\1\114\2\103\1\122\1"+
        "\114\1\105\1\124\2\114\1\105\1\uffff\1\107\2\101\1\40\1\uffff\1"+
        "\114\1\105\1\111\1\101\1\111\1\125\1\101\1\105\1\43\2\101\1\43\1"+
        "\102\1\105\1\40\1\43\1\105\1\101\2\uffff\1\101\1\121\1\40\1\117"+
        "\1\105\1\114\1\115\1\uffff\1\43\1\uffff\1\103\1\40\1\110\2\122\2"+
        "\124\2\101\1\113\1\40\1\101\2\122\1\43\1\105\1\43\1\111\1\115\1"+
        "\103\1\122\1\uffff\1\43\1\122\1\117\1\122\1\124\1\110\1\124\1\125"+
        "\1\124\1\115\1\uffff\2\102\1\43\1\uffff\1\114\1\122\1\uffff\1\111"+
        "\2\124\1\125\2\uffff\1\116\1\115\1\114\1\101\1\107\1\uffff\1\110"+
        "\2\uffff\1\40\2\43\1\105\1\122\1\124\1\104\1\43\1\103\2\uffff\1"+
        "\103\1\105\1\111\1\uffff\1\43\1\124\1\uffff\1\116\1\120\1\110\1"+
        "\101\1\uffff\1\111\1\116\1\40\1\117\1\43\1\105\1\114\1\105\1\101"+
        "\1\114\1\101\1\uffff\1\105\1\40\1\107\1\43\2\105\1\104\1\101\1\111"+
        "\1\122\1\105\1\126\1\101\1\uffff\1\43\1\101\2\105\1\uffff\1\124"+
        "\1\105\1\116\1\103\1\uffff\1\101\1\107\1\122\1\105\1\114\1\103\1"+
        "\101\2\uffff\1\122\1\43\1\124\1\43\1\114\1\105\1\123\1\40\1\uffff"+
        "\1\116\1\uffff\4\43\1\116\1\131\1\122\1\101\1\122\1\uffff\1\111"+
        "\2\43\1\105\1\43\1\103\1\124\1\115\1\43\1\105\1\43\1\114\1\43\1"+
        "\114\1\111\1\43\1\uffff\2\43\1\105\1\uffff\1\40\4\uffff\1\124\1"+
        "\40\1\43\1\114\1\43\1\116\2\uffff\1\122\1\uffff\1\105\1\43\1\120"+
        "\1\uffff\1\123\1\uffff\1\105\1\uffff\1\40\1\116\3\uffff\1\43\1\uffff"+
        "\1\43\2\uffff\1\43\1\uffff\1\124\1\40\1\123\1\uffff\1\43\1\123\1"+
        "\114\1\103\1\107\3\uffff\1\43\2\uffff\1\43\1\uffff\2\43\1\110\1"+
        "\43\4\uffff\1\101\1\uffff\1\122\1\40\1\103\2\uffff\1\124\1\105\1"+
        "\122\1\40\2\uffff";
    static final String DFA12_maxS =
        "\1\172\1\122\1\105\1\117\3\uffff\1\117\1\125\1\117\1\uffff\1\117"+
        "\1\116\1\117\1\71\1\122\1\120\1\115\1\122\1\116\1\101\2\111\1\105"+
        "\1\117\1\uffff\6\uffff\1\105\1\116\1\123\1\105\1\123\1\102\1\115"+
        "\1\172\1\107\1\124\1\115\1\124\1\110\2\116\1\114\1\123\1\131\1\125"+
        "\1\124\2\104\1\122\1\117\1\uffff\2\172\1\104\1\111\1\124\1\110\1"+
        "\101\1\111\1\40\1\172\1\122\2\124\1\101\1\125\2\uffff\1\101\1\123"+
        "\1\114\2\103\1\122\1\114\1\105\1\124\2\114\1\105\1\uffff\1\107\1"+
        "\117\1\101\1\40\1\uffff\1\114\1\105\1\111\1\101\1\124\1\125\1\101"+
        "\1\105\1\172\1\101\1\105\1\172\1\102\1\105\1\40\1\172\1\105\1\101"+
        "\2\uffff\1\101\1\121\1\172\1\117\1\105\1\114\1\115\1\uffff\1\172"+
        "\1\uffff\1\103\1\172\1\110\2\122\2\124\2\101\1\113\1\172\1\101\2"+
        "\122\1\172\1\105\1\172\1\111\1\115\1\103\1\122\1\uffff\1\172\1\122"+
        "\1\117\1\122\1\124\1\110\1\124\1\125\1\124\1\115\1\uffff\2\102\1"+
        "\172\1\uffff\1\114\1\122\1\uffff\1\111\2\124\1\125\2\uffff\1\116"+
        "\1\115\1\114\1\101\1\122\1\uffff\1\110\2\uffff\1\40\2\172\1\105"+
        "\1\122\1\124\1\104\1\172\1\103\2\uffff\1\103\1\105\1\111\1\uffff"+
        "\1\172\1\124\1\uffff\1\116\1\120\1\110\1\101\1\uffff\1\111\1\116"+
        "\1\172\1\117\1\172\1\105\1\114\1\105\1\101\1\114\1\101\1\uffff\1"+
        "\105\1\40\1\107\1\172\2\105\1\104\1\101\1\111\1\122\1\105\1\126"+
        "\1\101\1\uffff\1\172\1\101\2\105\1\uffff\1\124\1\105\1\116\1\103"+
        "\1\uffff\1\101\1\107\1\122\1\105\1\114\1\103\1\101\2\uffff\1\122"+
        "\1\172\1\124\1\172\1\114\1\105\1\123\1\40\1\uffff\1\116\1\uffff"+
        "\4\172\1\116\1\131\1\122\1\101\1\122\1\uffff\1\111\2\172\1\105\1"+
        "\172\1\103\1\124\1\115\1\172\1\105\1\172\1\114\1\172\1\114\1\111"+
        "\1\172\1\uffff\2\172\1\105\1\uffff\1\40\4\uffff\1\124\1\40\1\172"+
        "\1\114\1\172\1\116\2\uffff\1\122\1\uffff\1\105\1\172\1\120\1\uffff"+
        "\1\123\1\uffff\1\105\1\uffff\1\40\1\116\3\uffff\1\172\1\uffff\1"+
        "\172\2\uffff\1\172\1\uffff\1\124\1\172\1\123\1\uffff\1\172\1\123"+
        "\1\114\1\103\1\107\3\uffff\1\172\2\uffff\1\172\1\uffff\2\172\1\110"+
        "\1\172\4\uffff\1\101\1\uffff\1\122\1\101\1\103\2\uffff\1\124\1\105"+
        "\1\122\1\40\2\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\5\1\6\3\uffff\1\14\17\uffff\1\107\1\110\1\112\1"+
        "\113\1\114\1\115\30\uffff\1\25\17\uffff\1\105\1\106\14\uffff\1\102"+
        "\4\uffff\1\34\22\uffff\1\26\1\111\7\uffff\1\43\1\uffff\1\47\25\uffff"+
        "\1\17\12\uffff\1\66\3\uffff\1\104\2\uffff\1\22\4\uffff\1\35\1\45"+
        "\5\uffff\1\70\1\uffff\1\63\1\62\11\uffff\1\52\1\50\3\uffff\1\73"+
        "\2\uffff\1\76\4\uffff\1\16\13\uffff\1\75\15\uffff\1\77\4\uffff\1"+
        "\36\4\uffff\1\3\7\uffff\1\61\1\56\10\uffff\1\21\1\uffff\1\72\11"+
        "\uffff\1\1\20\uffff\1\27\3\uffff\1\74\1\uffff\1\30\1\40\1\103\1"+
        "\42\6\uffff\1\46\1\31\1\uffff\1\2\3\uffff\1\7\1\uffff\1\11\1\uffff"+
        "\1\64\2\uffff\1\20\1\65\1\32\1\uffff\1\23\1\uffff\1\37\1\67\1\uffff"+
        "\1\53\3\uffff\1\33\5\uffff\1\41\1\71\1\101\1\uffff\1\51\1\44\1\uffff"+
        "\1\100\4\uffff\1\15\1\24\1\10\1\12\1\uffff\1\13\3\uffff\1\60\1\55"+
        "\4\uffff\1\57\1\54";
    static final String DFA12_specialS =
        "\31\uffff\1\0\u014e\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\35\2\uffff\1\35\22\uffff\1\35\6\uffff\1\31\1\4\1\6\2\uffff"+
            "\1\5\1\37\1\16\1\36\13\uffff\1\12\3\33\2\uffff\1\14\1\25\1\1"+
            "\1\13\1\34\1\15\1\34\1\30\1\23\2\34\1\7\1\11\1\10\1\17\1\22"+
            "\1\34\1\2\1\21\1\3\1\20\1\24\1\26\1\34\1\27\1\34\6\uffff\32"+
            "\34",
            "\1\42\6\uffff\1\43\6\uffff\1\41\2\uffff\1\40",
            "\1\44",
            "\1\45\7\uffff\1\46\5\uffff\1\47",
            "",
            "",
            "",
            "\1\50",
            "\1\53\1\uffff\1\54\13\uffff\1\51\5\uffff\1\52",
            "\1\56\5\uffff\1\55",
            "",
            "\1\61\3\uffff\1\57\3\uffff\1\60\5\uffff\1\62",
            "\1\64\7\uffff\1\63\1\uffff\1\65",
            "\1\67\2\uffff\1\66",
            "\1\32\1\uffff\12\32",
            "\1\71\3\uffff\1\72",
            "\1\74\1\uffff\1\73",
            "\1\76\1\uffff\1\75\7\uffff\1\77",
            "\1\100",
            "\1\101\7\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\0\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\114\1\uffff\1\113",
            "\1\115",
            "\1\117\3\uffff\1\116",
            "\1\123\4\uffff\1\121\11\uffff\1\120\2\uffff\1\122",
            "\1\124",
            "\1\125",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\127",
            "\1\133\42\uffff\1\130\14\uffff\1\131\3\uffff\1\132",
            "\1\134\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\144\2\uffff\1\142\5\uffff\1\143",
            "\1\145",
            "\1\146\4\uffff\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\160",
            "\1\161",
            "\1\163\20\uffff\1\162",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\23\34\1\170\6\34"+
            "\4\uffff\1\34\1\uffff\32\34",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008d\15\uffff\1\u008c",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\12\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\10\34\1\u0099\21"+
            "\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u009b",
            "\1\u009c\3\uffff\1\u009d",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\2\uffff\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff"+
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\4\34\1\u00ac\25"+
            "\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00ae",
            "\1\u00af\2\uffff\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff"+
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00ba\2\uffff\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff"+
            "\1\u00b9\31\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u00c0",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\22\34\1\u00c1\7"+
            "\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de\12\uffff\1\u00df",
            "",
            "\1\u00e0",
            "",
            "",
            "\1\u00e1",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u00e7",
            "",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3\2\uffff\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff"+
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00f5",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "\1\u0118",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0119",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u012c",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0132",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0134",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0136",
            "\1\u0137",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u013b",
            "",
            "\1\u013c",
            "",
            "",
            "",
            "",
            "\1\u013d",
            "\1\u013e",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0140",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0142",
            "",
            "",
            "\1\u0143",
            "",
            "\1\u0144",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0146",
            "",
            "\1\u0147",
            "",
            "\1\u0148",
            "",
            "\1\u0149",
            "\1\u014a",
            "",
            "",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "\1\u014e",
            "\1\u014f\2\uffff\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff"+
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0151",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "",
            "",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "\1\u015b",
            "\2\34\10\uffff\1\34\2\uffff\12\34\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\u0160\40\uffff\1\u015f",
            "\1\u0162",
            "",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | NON_SECOND_DATETIME_FIELD | SQUOTE | CVALUE | NUMBER | COMPARATOR | LOG_CONJ | ID | WS | ML_COMMENT | OL_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 73;}

                        else s = 72;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}