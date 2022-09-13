/*
classe  MainActivity : AppCompatActivity () {

   override  fun  onCreate ( saveInstanceState :  Bundle ? ) {
        super .onCreate (savedInstanceState)
        setContentView( R .layout.activity_main)
         // ajout d'un écouteur de clic à tous nos boutons.
        b1.setOnClickListener {
            // sur la ligne ci-dessous, nous ajoutons
            // l'expression à notre vue texte.
            tvMain.text = (tvMain.text.toString() +  " 1 " )
        }
        b2.setOnClickListener {
            // sur la ligne ci-dessous, nous ajoutons
            // l'expression à notre vue texte.
            tvMain.text = (tvMain.text.toString() +  " 2 " )
        }
        b3.setOnClickListener {
            // sur la ligne ci-dessous, nous ajoutons
            // l'expression à notre vue texte.
            tvMain.text = (tvMain.text.toString() +  " 3 " )
        }
        b4.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " 4 " )
        }
        b5.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " 5 " )
        }
        b6.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " 6 " )
        }
        b7.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " 7 " )
        }
        b8.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " 8 " )
        }
        b9.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " 9 " )
        }
        b0.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " 0 " )
        }
        bdot.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " . " )
        }
        bplus.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " + " )
        }
        bdiv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " / " )
        }
        bbrac1.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " ( " )
        }
        bbrac2.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " ) " )
        }
        bpi.setOnClickListener {
            // en cliquant sur le bouton pi nous ajoutons
            // valeur pi de 3,142 à notre valeur actuelle.
            tvMain.text = (tvMain.text.toString() +  " 3.142 " )
            tvsec.text = (bpi.text.toString())
        }
        bsin.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " sin " )
        }
        bcos.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " cos " )
        }
        btan.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " tan " )
        }
        binv.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " ^ "  +  " (-1) " )
        }
        bln.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " ln " )
        }
        blog.setOnClickListener {
            tvMain.text = (tvMain.text.toString() +  " log " )
        }

        bminus.setOnClickListener {
            // en cliquant sur moins nous vérifions si
            // l'utilisateur a déjà une opération moins à l'écran.
            // si l'opération moins est déjà présente
            // alors nous ne ferons rien.
            val str :  String  = tvMain.text.toString()
            if ( ! str.get(index = str.length -  1 ).equals( " - " )) {
                tvMain.text = (tvMain.text.toString() +  " - " )
            }
        }
        bmul.setOnClickListener {
            // si le signe mul n'est pas présent dans notre
            // vue texte alors seulement nous ajoutons
            // l'opérateur de multiplication qui lui est associé.
            val str :  String  = tvMain.text.toString()
            if ( ! str.get(index = str.length -  1 ).equals( " * " )) {
                tvMain.text = (tvMain.text.toString() +  " * " )
            }
        }
        bsqrt.setOnClickListener {
            si (tvMain.text.toString().isEmpty()) {
                // si le nombre saisi est vide, nous affichons un message d'erreur.
                Toast .makeText( this , " Veuillez entrer un nombre valide.. " , Toast . LENGTH_SHORT ).show()
            } sinon {
                val str :  String  = tvMain.text.toString()
                // sur la ligne ci-dessous, nous calculons
                // racine carrée du nombre donné.
                val r =  Math .sqrt(str.toDouble())
                // sur la ligne ci-dessous, nous convertissons notre double
                // en chaîne, puis en le définissant en mode texte.
                val result = r.toString()
                tvMain.setText(résultat)
            }
        }
        bequal.setOnClickListener {
            val str :  String  = input.text.toString()
            // sur la ligne ci-dessous, nous appelons une évaluation
            // méthode pour calculer la valeur des expressions.
            val résultat :  Double  = évaluer(str)
            // sur la ligne ci-dessous, nous obtenons le résultat
            // et le mettre en mode texte.
            val r = result.toString()
            input.setText(r)
            output.text = str
        }
        bac.setOnClickListener {
            // en cliquant sur le bouton ac nous effaçons
            // notre vue texte primaire et secondaire.
            tvMain.setText( " " )
            tvsec.setText( " " )
        }
        bc.setOnClickListener {
            // en cliquant sur le bouton c nous effaçons
            // le dernier caractère en vérifiant la longueur.
            var str :  String  = tvMain.text.toString()
            if ( ! str.equals( " " )) {
                str = str.substring( 0 , str.length -  1 )
                tvMain.text = str
            }
        }
        bsquare.setOnClickListener {
            if (input.text.toString().isEmpty()) {
                // si le nombre saisi est vide, nous affichons un message d'erreur.
                Toast .makeText( this , " Veuillez entrer un nombre valide.. " , Toast . LENGTH_SHORT ).show()
            } else if {
                // sur la ligne ci-dessous, nous obtenons l'expression, puis calculons le carré du nombre
                val d :  Double  = tvMain.getText().toString().toDouble()
                // sur la ligne ci-dessous, nous calculons le carré.
                val carré = d * d
                // après avoir calculé le carré nous
                // le configurent en mode texte.
                tvMain.setText(square.toString())
                // sur la ligne ci-dessous, nous définissons
                // le d à la vue de texte secondaire.
                tvsec.text =  " $d ² "
            }
        }
        bfact.setOnClickListener {
            if (tvMain.text.toString().isEmpty()) {
                // si le nombre saisi est vide, nous affichons un message d'erreur.
                Toast .makeText( this , " Veuillez entrer un nombre valide.. " , Toast . LENGTH_SHORT ).show()
            } else if {
                // sur la ligne ci-dessous, nous obtenons la valeur int
                // et calcul de la valeur factorielle du nombre saisi.
                valeur val :  Int  = tvMain.text.toString().toInt()
                val fact :  Int  = factoriel(valeur)
                tvMain.setText(fact.toString())
                tvsec.text =  " $valeur ` ! "
            }

        }

    }

    fun  factoriel ( n :  Int ): Int {
        // cette méthode est utilisée pour trouver la factorielle
        retourner  si (n ==  1  || n ==  0 ) 1  sinon n * factoriel(n -  1 )
    }

     fun  évaluer ( str :  String ): Double {
        return object :  Any () {
        // sur la ligne ci-dessous, nous créons une variable
        // pour suivre la position et le char pos.
        var pos =  - 1
        var ch =  0

        // la méthode ci-dessous permet de passer au caractère suivant.
        amusant  suivantChar () {

            // sur la ligne ci-dessous, nous incrémentons notre position
            // et le déplacer vers la position suivante.
            ch =  if ( ++ pos < str.length) str[pos].toInt() else  - 1
        }

        // cette méthode est utilisée pour vérifier l'espace supplémentaire
        // présente int l'expression et la supprime.
        manger amusant ( charToEat :  Int ): Boolean {
        tandis que (ch ==  '  ' .toInt()) nextChar()
        // sur la ligne ci-dessous, nous vérifions le char pos
        // si les deux sont égaux, nous le renvoyons à true.
        si (ch == charToManger) {
            car suivant()
            retourner  vrai
        }
        retourner  faux
    }

        // la méthode ci-dessous consiste à analyser notre
        // expression et pour obtenir la réponse
        // dans ce que nous appelons une analyse
        // méthode d'expression pour calculer la valeur.
        analyse amusante (): Double {
        car suivant()
        val x = parseExpression()
        if (pos < str.length) throw  RuntimeException ( " Inattendu : "  + ch.toChar())
        retour x
    }

        // dans cette méthode nous n'effectuerons que l'addition et
        // opération de soustraction sur l'expression.
        amusement  parseExpression (): Double {
        var x = parseTerm()
        tandis que ( vrai ) {
            si (manger( ' + ' .toInt())) x + = parseTerm() // addition
            sinon  si (manger( ' - ' .toInt())) x - = parseTerm() // soustraction
            sinon  retour x
        }
    }

        // dans la méthode ci-dessous, nous effectuerons
        // uniquement opération de multiplication et de division.
        fun  parseTerm () : Double {
            var x = parseFactor()
            tandis que ( vrai ) {
                if (manger( ' * ' .toInt())) x * = parseFactor() // multiplication
                sinon  si (manger( ' / ' .toInt())) x / = parseFactor() // division
                sinon  retour x
            }
        }

        // la méthode ci-dessous est utilisée pour analyser le facteur
        fun  parseFacteur (): Double {
            // sur la ligne ci-dessous, nous vérifions l'ajout
            // et soustraction et réalisation d'opérations unaires.
            if (manger( ' + ' .toInt())) return parseFactor() // plus unaire
            if (eat( ' - ' .toInt())) return  - parseFactor() // moins unaire
            // création d'une double variable pour ans.
            var x :  Double
            // sur la ligne ci-dessous, nous créons
            // une variable pour la position.
            val startPos = pos
            // sur la ligne ci-dessous, nous vérifions
            // pour ouvrir et fermer les parenthèses.
            if (manger( ' ( ' .toInt())) { // parenthèses
                x = parseExpression()
                manger( ' ) ' .toInt())
            } sinon  si (ch >=  ' 0 ' .toInt() && ch <=  ' 9 ' .toInt() || ch ==  ' . ' .toInt()) {
                // nombres
                tandis que (ch >=  ' 0 ' .toInt() && ch <=  ' 9 ' .toInt() || ch ==  ' . ' .toInt()) nextChar()
                // sur la ligne ci-dessous, nous obtenons une sous-chaîne de notre chaîne en utilisant start et pos.
                x = str.substring(startPos, pos).toDouble()
            } sinon  si (ch >=  ' a ' .toInt() && ch <=  ' z ' .toInt()) {
                // sur la fonction ci-dessous, nous vérifions l'opérateur dans notre expression.
                tandis que (ch >=  ' a ' .toInt() && ch <=  ' z ' .toInt()) nextChar()
                val func = str.substring(startPos, pos)
                // appelant une méthode pour analyser notre facteur.
                x = parseFactor()
                // sur la ligne ci-dessous, nous vérifions la racine carrée.
                x =
                    if (func ==  " sqrt " ) Math .sqrt(x)
                // sur la ligne ci-dessous, nous vérifions la fonction sin
                // et calcul de la fonction sin à l'aide de la classe Math.
                sinon  si (func ==  " sin " ) Math .sin(
                        Math .toRadians(x)
                        // sur la ligne ci-dessous, nous calculons la valeur cos
                        ) sinon  si (fonc ==  " cos " ) Math .cos(
                        Math .toRadians(x)
                        // sur la ligne ci-dessous, nous calculons
                        // la valeur tan de notre expression.
                        ) sinon  si (func ==  " tan " )
                Math .tan( Math .toRadians(x))
                // sur la ligne ci-dessous, nous calculons
                // valeur de journal de l'expression.
                sinon  si (func ==  " log " )
                Mathématiques .log10(x)
                // sur la ligne ci-dessous, nous calculons
                // ln valeur de l'expression.
                sinon  si (func ==  " ln " ) Math .log(x)
                // f nous obtenons une erreur alors
                // nous renvoyons simplement l'exception.
                sinon  lancer  RuntimeException (
                    " Fonction inconnue : $func "
                )
            } sinon {
                // si la condition n'est pas satisfaite, nous renvoyons l'exception
                throw  RuntimeException ( " Inattendu : "  + ch.toChar())
            }
            // sur la ligne ci-dessous, nous calculons la puissance de l'expression.
            if (eat( ' ^ ' .toInt())) x =  Math .pow(x, parseFactor()) // exponentiation
            retour x
        }
        // enfin appeler une analyse pour notre expression.
    }.parse()
    }
}

*///