package com.marcnuri.helm.jni;

import com.sun.jna.Structure;

@Structure.FieldOrder({
  "name",
  "generateName",
  "nameTemplate",
  "chart",
    "version",
  "namespace",
  "createNamespace",
  "description",
  "devel",
  "dependencyUpdate",
  "dryRun",
  "dryRunOption",
  "wait",
  "values",
  "kubeConfig",
  "certFile",
  "keyFile",
  "caFile",
  "insecureSkipTlsVerify",
  "plainHttp",
  "keyring",
  "debug",
  "clientOnly"
})
public class InstallOptions extends Structure {

  public String name;
  public int generateName;
  public String nameTemplate;
  public String chart;
  public String version;
  public String namespace;
  public int createNamespace;
  public String description;
  public int devel;
  public int dependencyUpdate;
  public int dryRun;
  public String dryRunOption;
  public int wait;
  public String values;
  public String kubeConfig;
  public String certFile;
  public String keyFile;
  public String caFile;
  public int insecureSkipTlsVerify;
  public int plainHttp;
  public String keyring;
  public int debug;
  public int clientOnly;

  public InstallOptions(
    String name,
    int  generateName,
    String nameTemplate,
    String chart,
    String version,
    String namespace,
    int createNamespace,
    String description,
    int devel,
    int dependencyUpdate,
    int dryRun,
    String dryRunOption,
    int wait,
    String values,
    String kubeConfig,
    String certFile,
    String keyFile,
    String caFile,
    int insecureSkipTlsVerify,
    int plainHttp,
    String keyring,
    int debug,
    int clientOnly
  ) {
    this.name = name;
    this.generateName = generateName;
    this.nameTemplate = nameTemplate;
    this.chart = chart;
    this.version = version;
    this.namespace = namespace;
    this.createNamespace = createNamespace;
    this.description = description;
    this.devel = devel;
    this.dependencyUpdate = dependencyUpdate;
    this.dryRun = dryRun;
    this.dryRunOption = dryRunOption;
    this.wait = wait;
    this.values = values;
    this.kubeConfig = kubeConfig;
    this.certFile = certFile;
    this.keyFile = keyFile;
    this.caFile = caFile;
    this.insecureSkipTlsVerify = insecureSkipTlsVerify;
    this.plainHttp = plainHttp;
    this.keyring = keyring;
    this.debug = debug;
    this.clientOnly = clientOnly;
  }
}
