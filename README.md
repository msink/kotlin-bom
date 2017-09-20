# kotlin-bom

Small utility for converting PCAD2000 BOM file

Для создания bom файла sch файле делаем:

- для конденсаторов заполняется поле Value - номинал.
  В закладке Attributes в Description указывается тип-ТКЕ-напряжение\+-?%
  Если в поле Description ничего не указано, то берётся значение по умолчанию -
  ТКЕ - Z5U и процент +-20%.
  Для SMD конденсаторов не указывается тип (0805 и т.п.).
  Для остальных тип указывается в поле Description.

- для резисторов в Description указывается +-?%, если надо указать напряжение, то
  указывается напряжение\+-?%
  Если в поле Description ничего не указано, то берётся значение по умолчанию -
  процент +-5%.
  Если резистор не SMD, то название указывается в Description, если в Description ничего не указано,
  то по умолчанию заносится тип С2-23.

- для набора резисторов наименование указывается в Description.

- для дросселей наименование указывается в поле Value,
  если начало поля Value не совпадает с Type, то в перечень заносится Value,
  если не совпадает, то Type-Value

- для всего остального, указывается в Description, если нет Description, то Value, если Value нет, то Type.

Для получения bom файла: File -> Reports.

Галочка на Bom, Style Format - Separated List @.

В Customize bom
- закладка Selection - галочки: Count, CompName, RefDes, PatternName, Value, Description
- закладка Sort - в Selected Fields добавляем RefDes
