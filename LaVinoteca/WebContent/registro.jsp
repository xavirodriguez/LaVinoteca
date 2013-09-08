        <form action="registrar" method="POST" id="registrar" class="register">
            <h1>Registro</h1>
            <fieldset class="row1">
                <legend>Detalles de la cuenta
                </legend>
                <p>
                    <label>Email *
                    </label>
                    <input type="text" id="email" name="email"/>
                    <label>Repetir email *
                    </label>
                    <input type="text" id="email2" name="email2"/>
                </p>
                <p>
                    <label>Contraseña*
                    </label>
                    <input type="password"  id="password" name="password"/>
                    <label>Repetir contraseña*
                    </label> 
                    <input type="password"  id="password2" name="password2"/>
                    <label class="obinfo">* campos obligatorios
                    </label>
                </p>
            </fieldset>
            <fieldset class="row2">
                <legend>Detalles de contacto
                </legend>
                <p>
                    <label>Nombre *
                    </label>
                    <input type="text" class="long" id="nombre" name="nombre"/>
                </p>
                             <p>
                    <label>Apellidos *
                    </label>
                    <input type="text" class="long" id="apellidos" name="apellidos"/>
                </p>
                     <p>
                    <label>DNI *
                    </label>
                    <input type="text" maxlength="10" id="dni" name="dni"/>
                </p>
                <p>
                    <label>Teléfono *
                    </label>
                    <input type="text" maxlength="10" id="telefono" name="telefono"/>
                </p>
                 <p>
                    <label>Teléfono fijo
                    </label>
                    <input type="text" maxlength="10" id="telefonoFijo" name="telefonoFijo"/>
                </p>
            
                <p>
                    <label>Dirección
                    </label>
                    <input type="text" class="long" id="direccion" name="direccion"/>
                </p>
                <p>
                    <label>Ciudad *
                    </label>
                    <input type="text" class="long" id="ciudad" name="ciudad" />

                </p>
                <p>
                    <label>País *
                    </label>
                    <select id="pais" name="pais">
                    <option value="AF">Afghanistan</option><option value="AL">Albania</option><option value="DZ">Algeria</option><option value="AS">American Samoa</option><option value="AD">Andorra</option><option value="AO">Angola</option><option value="AI">Anguilla</option><option value="AQ">Antarctica</option><option value="AG">Antigua and Barbuda</option><option value="AR">Argentina</option><option value="AM">Armenia</option><option value="AW">Aruba</option><option value="AU">Australia</option><option value="AT">Austria</option><option value="AZ">Azerbaijan</option><option value="BS">Bahamas</option><option value="BH">Bahrain</option><option value="BD">Bangladesh</option><option value="BB">Barbados</option><option value="BY">Belarus</option><option value="BE">Belgium</option><option value="BZ">Belize</option><option value="BJ">Benin</option><option value="BM">Bermuda</option><option value="BT">Bhutan</option><option value="BO">Bolivia</option><option value="BA">Bosnia and Herzegovina</option><option value="BW">Botswana</option><option value="BV">Bouvet Island</option><option value="BR">Brazil</option><option value="BQ">British Antarctic Territory</option><option value="IO">British Indian Ocean Territory</option><option value="VG">British Virgin Islands</option><option value="BN">Brunei</option><option value="BG">Bulgaria</option><option value="BF">Burkina Faso</option><option value="BI">Burundi</option><option value="KH">Cambodia</option><option value="CM">Cameroon</option><option value="CA">Canada</option><option value="CT">Canton and Enderbury Islands</option><option value="CV">Cape Verde</option><option value="KY">Cayman Islands</option><option value="CF">Central African Republic</option><option value="TD">Chad</option><option value="CL">Chile</option><option value="CN">China</option><option value="CX">Christmas Island</option><option value="CC">Cocos [Keeling] Islands</option><option value="CO">Colombia</option><option value="KM">Comoros</option><option value="CG">Congo - Brazzaville</option><option value="CD">Congo - Kinshasa</option><option value="CK">Cook Islands</option><option value="CR">Costa Rica</option><option value="HR">Croatia</option><option value="CU">Cuba</option><option value="CY">Cyprus</option><option value="CZ">Czech Republic</option><option value="CI">Côte d'Ivoire</option><option value="DK">Denmark</option><option value="DJ">Djibouti</option><option value="DM">Dominica</option><option value="DO">Dominican Republic</option>
                    <option value="NQ">Dronning Maud Land</option><option value="DD">East Germany</option><option value="EC">Ecuador</option><option value="EG">Egypt</option><option value="SV">El Salvador</option><option value="GQ">Equatorial Guinea</option><option value="ER">Eritrea</option><option value="EE">Estonia</option><option value="ET">Ethiopia</option><option value="FK">Falkland Islands</option><option value="FO">Faroe Islands</option><option value="FJ">Fiji</option><option value="FI">Finland</option><option value="FR">France</option><option value="GF">French Guiana</option><option value="PF">French Polynesia</option><option value="TF">French Southern Territories</option><option value="FQ">French Southern and Antarctic Territories</option><option value="GA">Gabon</option><option value="GM">Gambia</option><option value="GE">Georgia</option><option value="DE">Germany</option><option value="GH">Ghana</option><option value="GI">Gibraltar</option><option value="GR">Greece</option><option value="GL">Greenland</option><option value="GD">Grenada</option><option value="GP">Guadeloupe</option><option value="GU">Guam</option><option value="GT">Guatemala</option><option value="GG">Guernsey</option><option value="GN">Guinea</option><option value="GW">Guinea-Bissau</option><option value="GY">Guyana</option><option value="HT">Haiti</option><option value="HM">Heard Island and McDonald Islands</option><option value="HN">Honduras</option><option value="HK">Hong Kong SAR China</option><option value="HU">Hungary</option><option value="IS">Iceland</option><option value="IN">India</option><option value="ID">Indonesia</option><option value="IR">Iran</option><option value="IQ">Iraq</option><option value="IE">Ireland</option><option value="IM">Isle of Man</option><option value="IL">Israel</option><option value="IT">Italy</option><option value="JM">Jamaica</option><option value="JP">Japan</option><option value="JE">Jersey</option><option value="JT">Johnston Island</option><option value="JO">Jordan</option><option value="KZ">Kazakhstan</option><option value="KE">Kenya</option><option value="KI">Kiribati</option><option value="KW">Kuwait</option><option value="KG">Kyrgyzstan</option><option value="LA">Laos</option><option value="LV">Latvia</option><option value="LB">Lebanon</option><option value="LS">Lesotho</option><option value="LR">Liberia</option><option value="LY">Libya</option><option value="LI">Liechtenstein</option><option value="LT">Lithuania</option><option value="LU">Luxembourg</option><option value="MO">Macau SAR China</option><option value="MK">Macedonia</option><option value="MG">Madagascar</option><option value="MW">Malawi</option><option value="MY">Malaysia</option><option value="MV">Maldives</option><option value="ML">Mali</option><option value="MT">Malta</option><option value="MH">Marshall Islands</option><option value="MQ">Martinique</option><option value="MR">Mauritania</option><option value="MU">Mauritius</option><option value="YT">Mayotte</option><option value="FX">Metropolitan France</option><option value="MX">Mexico</option><option value="FM">Micronesia</option><option value="MI">Midway Islands</option><option value="MD">Moldova</option><option value="MC">Monaco</option><option value="MN">Mongolia</option><option value="ME">Montenegro</option><option value="MS">Montserrat</option><option value="MA">Morocco</option><option value="MZ">Mozambique</option><option value="MM">Myanmar [Burma]</option><option value="NA">Namibia</option><option value="NR">Nauru</option><option value="NP">Nepal</option><option value="NL">Netherlands</option><option value="AN">Netherlands Antilles</option><option value="NT">Neutral Zone</option><option value="NC">New Caledonia</option><option value="NZ">New Zealand</option><option value="NI">Nicaragua</option><option value="NE">Niger</option><option value="NG">Nigeria</option><option value="NU">Niue</option><option value="NF">Norfolk Island</option><option value="KP">North Korea</option><option value="VD">North Vietnam</option><option value="MP">Northern Mariana Islands</option><option value="NO">Norway</option><option value="OM">Oman</option><option value="PC">Pacific Islands Trust Territory</option><option value="PK">Pakistan</option><option value="PW">Palau</option><option value="PS">Palestinian Territories</option><option value="PA">Panama</option><option value="PZ">Panama Canal Zone</option><option value="PG">Papua New Guinea</option><option value="PY">Paraguay</option><option value="YD">People's Democratic Republic of Yemen</option><option value="PE">Peru</option><option value="PH">Philippines</option><option value="PN">Pitcairn Islands</option><option value="PL">Poland</option><option value="PT">Portugal</option><option value="PR">Puerto Rico</option><option value="QA">Qatar</option><option value="RO">Romania</option><option value="RU">Russia</option><option value="RW">Rwanda</option><option value="RE">Réunion</option><option value="BL">Saint Barthélemy</option><option value="SH">Saint Helena</option><option value="KN">Saint Kitts and Nevis</option><option value="LC">Saint Lucia</option><option value="MF">Saint Martin</option><option value="PM">Saint Pierre and Miquelon</option><option value="VC">Saint Vincent and the Grenadines</option><option value="WS">Samoa</option><option value="SM">San Marino</option><option value="SA">Saudi Arabia</option><option value="SN">Senegal</option><option value="RS">Serbia</option><option value="CS">Serbia and Montenegro</option><option value="SC">Seychelles</option><option value="SL">Sierra Leone</option><option value="SG">Singapore</option><option value="SK">Slovakia</option><option value="SI">Slovenia</option><option value="SB">Solomon Islands</option><option value="SO">Somalia</option><option value="ZA">South Africa</option><option value="GS">South Georgia and the South Sandwich Islands</option><option value="KR">South Korea</option><option value="ES">Spain</option><option value="LK">Sri Lanka</option><option value="SD">Sudan</option><option value="SR">Suriname</option><option value="SJ">Svalbard and Jan Mayen</option><option value="SZ">Swaziland</option><option value="SE">Sweden</option><option value="CH">Switzerland</option><option value="SY">Syria</option><option value="ST">São Tomé and Príncipe</option><option value="TW">Taiwan</option><option value="TJ">Tajikistan</option><option value="TZ">Tanzania</option><option value="TH">Thailand</option><option value="TL">Timor-Leste</option><option value="TG">Togo</option><option value="TK">Tokelau</option><option value="TO">Tonga</option><option value="TT">Trinidad and Tobago</option><option value="TN">Tunisia</option><option value="TR">Turkey</option><option value="TM">Turkmenistan</option><option value="TC">Turks and Caicos Islands</option><option value="TV">Tuvalu</option><option value="UM">U.S. Minor Outlying Islands</option><option value="PU">U.S. Miscellaneous Pacific Islands</option><option value="VI">U.S. Virgin Islands</option><option value="UG">Uganda</option><option value="UA">Ukraine</option><option value="SU">Union of Soviet Socialist Republics</option><option value="AE">United Arab Emirates</option><option value="GB">United Kingdom</option><option value="US">United States</option><option value="ZZ">Unknown or Invalid Region</option><option value="UY">Uruguay</option><option value="UZ">Uzbekistan</option><option value="VU">Vanuatu</option><option value="VA">Vatican City</option><option value="VE">Venezuela</option><option value="VN">Vietnam</option><option value="WK">Wake Island</option><option value="WF">Wallis and Futuna</option><option value="EH">Western Sahara</option><option value="YE">Yemen</option><option value="ZM">Zambia</option><option value="ZW">Zimbabwe</option><option value="AX">Åland Islands</option>
                    </select>
                </p>

            </fieldset>

            <fieldset class="row3">
                <legend>Detalles personales
                </legend>
                <p>
                    <label>Sexo *</label>
                    <input type="radio" value="1" id="varon" name="sexo"/>
                    <label class="gender">Varón</label>
                    <input type="radio" value="2" id="mujer" name="sexo"/>
                    <label class="gender">Mujer</label>
                </p>
                <p>
                    <label>Fecha de nacimiento *
                    </label>
                    <select class="date" id="dia" name="dia">
                        <option value="1">01
                        </option>
                        <option value="2">02
                        </option>
                        <option value="3">03
                        </option>
                        <option value="4">04
                        </option>
                        <option value="5">05
                        </option>
                        <option value="6">06
                        </option>
                        <option value="7">07
                        </option>
                        <option value="8">08
                        </option>
                        <option value="9">09
                        </option>
                        <option value="10">10
                        </option>
                        <option value="11">11
                        </option>
                        <option value="12">12
                        </option>
                        <option value="13">13
                        </option>
                        <option value="14">14
                        </option>
                        <option value="15">15
                        </option>
                        <option value="16">16
                        </option>
                        <option value="17">17
                        </option>
                        <option value="18">18
                        </option>
                        <option value="19">19
                        </option>
                        <option value="20">20
                        </option>
                        <option value="21">21
                        </option>
                        <option value="22">22
                        </option>
                        <option value="23">23
                        </option>
                        <option value="24">24
                        </option>
                        <option value="25">25
                        </option>
                        <option value="26">26
                        </option>
                        <option value="27">27
                        </option>
                        <option value="28">28
                        </option>
                        <option value="29">29
                        </option>
                        <option value="30">30
                        </option>
                        <option value="31">31
                        </option>
                    </select>
                    <select id="mes" name="mes">
                        <option value="1">Enero
                        </option>
                        <option value="2">Febrero
                        </option>
                        <option value="3">Marzo
                        </option>
                        <option value="4">Abril
                        </option>
                        <option value="5">Mayo
                        </option>
                        <option value="6">Junio
                        </option>
                        <option value="7">Julio
                        </option>
                        <option value="8">Agosto
                        </option>
                        <option value="9">Septiembre
                        </option>
                        <option value="10">Octubre
                        </option>
                        <option value="11">Noviembre
                        </option>
                        <option value="12">Diciembre
                        </option>
                    </select>
                    <input class="year" id="anho" name="anho" type="text" size="4" maxlength="4"/>ej. 1976
                </p>

                <div class="infobox"><h4>Ley Orgánica de Protección de Datos</h4>
<p>
En esta web, propiedad de HOTEL JAVA RESORT S.L. aseguramos la total protección de los datos de carácter personal proporcionados por nuestros usuarios. De conformidad con lo dispuesto en la Ley Orgánica 15/1999 de Protección de Datos, le informamos que los datos personales facilitados a través de los formularios de esta web o mediante mensajes de correo electrónico, podrán ser incorporados en nuestros ficheros, en concreto al denominado 'Agenda de Contactos'. Mediante el envío de los formularios existentes en esta web, el remitente da su consentimiento para ser incluido en los mencionados ficheros. Así mismo, le comunicamos que desde esta web se podrán recoger direcciones IP de los usuarios, las cuales serán igualmente tratadas de acuerdo a la normativa vigente. Las finalidades del fichero son gestión de clientes, contable, fiscal y administrativa, y recursos humanos, y servicios económicos-financieros y seguros, y publicidad y prospección comercial, y otras finalidades. Todos los ficheros han sido debidamente registrados en la Agencia Española de Protección de Datos. 
</p>
<p>
Sus datos podrán ser cedidos, siempre protegiendo los datos adecuadamente, a organizaciones o personas directamente relacionadas con el responsable, y otros órganos de la administración pública. HOTEL JAVA RESORT S.L. respetará en todo momento la confidencialidad de sus datos, según conformidad con la Ley Orgánica 15/1999, de 13 de diciembre, sobre Protección de Datos de Carácter Personal (LOPD). 
</p>
<p>
En cualquier momento puede usted ejecutar sus derechos de oposición, acceso, rectificación, cancelación y oposición de su autorización sin efectos retroactivos en los términos especificados en la Ley Orgánica 15/1999, de Protección de Datos de Carácter Personal, conforme al procedimiento legalmente establecido. Estos derechos podrán ser ejercidos dirigiéndose por correo electrónico a java@bghotels.com o personalmente a C/ Goleta, s/n - 07610 Playa de Palma (Islas Baleares) NOTA: Para continuar con el proceso de envío de la información, el usuario deberá marcar una casilla indicando que ha leído y aceptado las condiciones de protección de datos de la empres. Una vez marcada, podrá procederse al envío de los datos a la empresa.             </p></div>
            </fieldset>
          <fieldset class="row4">
                <legend>Condiciones de uso
                </legend>
                <p class="agreement">
                    <input type="checkbox" value="" id="condiciones" name="condiciones"/>
                    <label>*  Acepto las <a href="#">condiciones de uso</a></label>
                </p>
                <p class="agreement">
                    <input type="checkbox" value="" id="lopd" name="lopd"/>
                    <label>* He leído y acepto la <a href="#">LOPD</a>.  </label>
                </p>
            <div><button class="button">Registrar &raquo;</button></div>
            </fieldset>  

        </form>