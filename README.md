# Mybatis-work
Mybatisを使用してREST APIとDatabaseを連携するレポジトリです。
MySQLの情報をCRUD処理を通じてlocalhostに反映させます。
まずはCreate処理です。（２２／９／２０）

- ## 出力結果

![image](https://user-images.githubusercontent.com/107293004/191079402-837da683-b408-4422-89bd-d28de0b2690c.png)


- ## Description
  パッケージを以下のように分けて、記述しています。

  - ### Controllerパッケージ
    ここにはREST APIに対応するコードを記述しています。
    
    Responseファイルは小川先生のコードを参考にしました。
    
  - ### Mapperパッケージ
    Databaseに対する処理についてのコードを記述しています。

  - ### Serviceパッケージ
    ControllerとMapperの間の業務処理に関するコードを記述しています。  
    
    パッケージの中はInterfaceとそれを実装するクラスで構成しています。

  - ### Entityパッケージ
    localhostに表示するデータの形を決めるコードを記述しています。
    
    今回は家計簿を想定して
      - id
      - 収入／支出の別
      - カテゴリ
      - 金額     
     から構成しています。
