# kotlin-bom

Small utility for converting PCAD2000 BOM file

Для создания bom файла в sch файле делаем:

- для конденсаторов заполняется поле Value - номинал.
  В закладке Attributes в Description указывается тип-ТКЕ-напряжение\+-?%
  Если в поле Description ничего не указано, то берётся значение по умолчанию -
  ТКЕ - Y5U и процент +-20%.
  Для SMD конденсаторов не указывается тип (0805 и т.п.).
  Для остальных тип указывается в поле Description.
  Если в номинале есть точка или запятая, то это микрофарады, если нет, то пикофарады.
  Маленькая русская н или английская n означает нанофарады. Если она стоит между цифр,
  то она выполняет роль точки.
  Если номинала у конденсатора нет, поле Value оставляется пустым.
  Если не нужен %, то в конце поля Description ставится "\".

- для резисторов в Description указывается +-?%, если надо указать напряжение,
  то указывается напряжение\+-?%
  Если в поле Description ничего не указано, то берётся значение по умолчанию -
  процент +-5%.
  Если резистор не SMD, то название указывается в Description, если в
  Description ничего не указано, то по умолчанию заносится тип С2-23.
  Градус цельсия указывается - "С

- для набора резисторов наименование указывается в Description.

- для дросселей
  наименование указывается в поле Value,
  если начало поля Value совпадает с Type, то в перечень заносится Value,
  если не совпадает, то Type-Value
  если заполнено поле Description, то в перечень заносится только оно.

- для всего остального указывается в Description, если нет Description,
  то Value, если Value нет, то Type.

Для получения bom файла: File -> Reports, установить галочку на Bom,
выбрать Style Format - Separated List @.

Тут же для поля bom установим дополнительные параметры, для чего нажимаем Customize:

- закладка Selection - галочки:
  Count, CompName, RefDes, PatternName, Value, Description

- закладка Sort - в Selected Fields добавляем RefDes так, чтобы он оказался на первом месте.

Обозначение на схеме:
терморезистор - RT
варистор - RU
Оптопара - DO
Вилка - XP
Розетка - XS
Джампер - JP

Если компонент не надо заносить в перечень и заявку, то в конце позиционного обозначения
ставим тильду (Shift+`(там где "ё")), например, "JP3~".
Если в конце позиционного обозначения стоит звёздочка, например, VD3*, VD3**, VD3***,
то этот компонени заносится как замена для VD3.

В папке с файлом имя.bom должен лежать файл имя.txt.
В этом файле должно быть четыре строки, например:
-----
Код: ИСЕБ.469475.ххх
Разработал: Половодов
Проверил: Сапатов
Утвердил: Кропотов
-----
