package cn.nurasoft.zero.VBNet;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/*
 * Created by Administrator on 26/02/2018.
 */

public class Key_words_Activity extends AppCompatActivity {

    TextView key1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.key_words_view);


        key1 = findViewById(R.id.Key1);

        String key_1 = "<h4>A-C:</h4>\n" +
                "<h5><font color='FUCHSIA'>\n" +
                "AddHandler&emsp;\n" +
                "&emsp;AddressOf\n" +
                "&emsp;Alias\n" +
                "&emsp;And\n" +
                "&emsp;AndAlso\n" +
                "&emsp;As \n" +
                "&emsp;Boolean\n" +
                "&emsp;ByRef \n" +
                "&emsp;Byte \n" +
                "&emsp;ByVal \n" +
                "&emsp;Call\n" +
                "&emsp;Case\n" +
                "&emsp;Catch\n" +
                "&emsp;CBool\n" +
                "&emsp;CByte\n" +
                "&emsp;CChar\n" +
                "&emsp;CDate\n" +
                "&emsp;CDbl \n" +
                "&emsp;CDec \n" +
                "&emsp;Char \n" +
                "&emsp;CInt \n" +
                "&emsp;Class \n" +
                "&emsp;Constraint \n" +
                "&emsp;Class \n" +
                "&emsp;Statement \n" +
                "&emsp;CLng \n" +
                "&emsp;CObj\n" +
                "&emsp;Const\n" +
                "&emsp;Continue\n" +
                "&emsp;CSByte\n" +
                "&emsp;CShort\n" +
                "&emsp;CSng\n" +
                "&emsp;CStr \n" +
                "&emsp;CType \n" +
                "&emsp;CUInt \n" +
                "&emsp;CULng \n" +
                "&emsp;CUShort \n" +
                "</font>  \n" +
                "</h5>\n" +
                "    <h4>D-F:</h4>\n" +
                "<h5><font color='PURPLE'>Date\n" +
                "&emsp;Decimal\n" +
                "&emsp;Declare \n" +
                "&emsp;Default \n" +
                "&emsp;Delegate \n" +
                "&emsp;Dim \n" +
                "&emsp;DirectCast \n" +
                "&emsp;Do \n" +
                "&emsp;Double \n" +
                "&emsp;Each \n" +
                "&emsp;Else \n" +
                "&emsp;ElseIf\n" +
                "&emsp;End\n" +
                "&emsp;Statement\n" +
                "&emsp;End\n" +
                "&emsp;EndIf\n" +
                "&emsp;Enum \n" +
                "&emsp;Erase \n" +
                "&emsp;Error \n" +
                "&emsp;Event \n" +
                "&emsp;Exit \n" +
                "&emsp;False \n" +
                "&emsp;Finally \n" +
                "&emsp;For\n" +
                "&emsp;(in For…Next) \n" +
                "&emsp;Each…Next\n" +
                "&emsp;Friend\n" +
                "&emsp;Function</font>\n" +
                "</h5>\n" +
                "    <h4>G-L:</h4>\n" +
                "        <h5><font color='blue'>\n" +
                "Function&emsp;\n" +
                "Get&emsp;\n" +
                "GetType&emsp;\n" +
                "Get(XMLNamespace)&emsp;\n" +
                "Global&emsp;\n" +
                "GoSub&emsp;\n" +
                "GoTo&emsp;\n" +
                "Handles&emsp;\n" +
                "If&emsp;\n" +
                "If()&emsp;\n" +
                "Implements&emsp;\n" +
                "Implements&emsp;\n" +
                "Statement&emsp;\n" +
                "Imports(.NET Namespace and Type)&emsp;\n" +
                "Imports(XML Namespace)&emsp;\n" +
                "In&emsp;\n" +
                "In(Generic Modifier)&emsp;\n" +
                "Inherits&emsp;\n" +
                "Integer&emsp;\n" +
                "Interface&emsp;\n" +
                "Is&emsp;\n" +
                "IsNot&emsp;\n" +
                "Let&emsp;\n" +
                "Lib&emsp;\n" +
                "Like&emsp;\n" +
                "Long&emsp;\n" +
                "Loop&emsp;\n" +
                "</font></h5>\n" +
                "\n" +
                "    <h4>M-P:</h4>\n" +
                "<h5><font color='MAROON'>\n" +
                "Me&emsp;Mod&emsp;Module&emsp;Module&emsp;Statement&emsp;MustInherit&emsp;MustOverride&emsp;MyBase&emsp;MyClass&emsp;Namespace&emsp;Narrowing&emsp;New&emsp;Constraint&emsp;New&emsp;Operator&emsp;Next\n" +
                "Next&emsp;(in&emsp;Resume)&emsp;Not&emsp;Nothing&emsp;NotInheritable&emsp;NotOverridable&emsp;Object&emsp;Of&emsp;On&emsp;Operator&emsp;Option&emsp;Optional&emsp;Or&emsp;OrElse&emsp;Out&emsp;(Generic&emsp;Modifier)\n" +
                "Overloads&emsp;Overridable&emsp;Overrides&emsp;ParamArray&emsp;Partial&emsp;Private&emsp;Property&emsp;Protected&emsp;Public&emsp;\n" +
                "</font></h5>\n" +
                "    <h4>Q-T:</h4>\n" +
                "    <h5>\n" +
                "<font color='OLIVE'>\n" +
                "&emsp;RaiseEvent&emsp;ReadOnly&emsp;ReDim&emsp;REM&emsp;RemoveHandler&emsp;Resume&emsp;Return&emsp;SByte&emsp;Select&emsp;Set&emsp;Shadows&emsp;Shared&emsp;Short&emsp;Single\n" +
                "Static&emsp;Step&emsp;Stop&emsp;String&emsp;Structure&emsp;Constraint&emsp;Structure&emsp;Statement&emsp;Sub&emsp;SyncLock&emsp;Then&emsp;Throw&emsp;To&emsp;True&emsp;Try&emsp;TryCast&emsp;TypeOf…Is&emsp;\n" +
                "</font> </h5>\n" +
                "     <h4>U-Z:</h4>\n" +
                "<h5><font color='TEAL'>\n" +
                "&emsp;Try&emsp;TryCast&emsp;TypeOf…Is&emsp;UInteger&emsp;ULong&emsp;UShort&emsp;Using&emsp;Variant&emsp;Wend&emsp;When&emsp;While&emsp;Widening&emsp;With&emsp;WithEvents&emsp;WriteOnly&emsp;Xor\n" +
                "</font>\n" +
                "</h5>\n" +
                "    <h4>Symbols:</h4>\n" +
                "<h5><font color='NAVY'>\n" +
                "#Const&emsp;#Else&emsp;#ElseIf&emsp;#End&emsp;#If&emsp;=&emsp;&&emsp;&=&emsp;*&emsp;*=&emsp;/&emsp;/=&emsp;\\&emsp;\\=&emsp;^&emsp;^=&emsp;+&emsp;+=&emsp;-&emsp;-=&emsp;>>&emsp;>>=&emsp;<<&emsp;<<=\n";

        key1.setText(Html.fromHtml(key_1));


    }
}


